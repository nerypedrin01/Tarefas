package br.com.pedro.tarefas.business;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.pedro.tarefas.persistence.Dao;

public abstract class Business<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	protected EntityManager em;

	protected Dao<T> dao;

	@PostConstruct
	public void init() {
		@SuppressWarnings("unchecked")
		Class<T> clas = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		dao = new Dao<>(clas, em);
	}

	public void persist(T t) {
		dao.persist(t);
	}

	public void remove(T t) {
		dao.remove(t);
	}

	public void refresh(T t) {
		dao.refresh(t);
	}

	public void merge(T t) {
		dao.merge(t);
	}

	public T getEntity(Object pk) {
		return (T) dao.getEntity(pk);
	}
}

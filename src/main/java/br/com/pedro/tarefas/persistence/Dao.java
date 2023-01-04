package br.com.pedro.tarefas.persistence;

import java.io.Serializable;

import javax.persistence.EntityManager;

public class Dao<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Class<T> clas;
	private EntityManager em;

	public Dao(Class<T> clas, EntityManager em) {
		this.clas = clas;
		this.em = em;
	}

	public void persist(T t) {
		em.persist(t);
	}

	public void remove(T t) {
		em.remove(t);
	}

	public void refresh(T t) {
		em.refresh(t);
	}

	public void merge(T t) {
		em.merge(t);
	}

	public T getEntity(Object pk) {
		return (T) em.find(clas, pk);
	}
	
}

package br.com.pedro.tarefas.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TAREFAS", schema = "TAREFA")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Tarefas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_TAREFA")
	private Integer codTarefa;

	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "CONTEUDO")
	private String conteudo;
}

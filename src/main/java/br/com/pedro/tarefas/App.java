package br.com.pedro.tarefas;

import br.com.pedro.tarefas.domain.Tarefas;

public class App {
	public static void main(String[] args) {
		
		Tarefas tarefas = new Tarefas();
		tarefas.setTitulo("Dia 1");
		tarefas.getTitulo();
	}
}

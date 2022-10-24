package com.clauber.estruturadados.fila.teste;

import com.clauber.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		
//		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
//
//		fila.enfileira(1);
//		fila.enfileira(3);
//		fila.enfileira(2);
		
		
		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
		
		fila.enfileira(new Paciente("A", 2));
		fila.enfileira(new Paciente("C", 1));
		fila.enfileira(new Paciente("B", 3));

		
		System.out.println(fila);
	}

}

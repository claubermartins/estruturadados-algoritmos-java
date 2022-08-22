package com.clauber.estruturadados.vetor.teste;

import com.clauber.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		try {
			vetor.adiciona("B");
			vetor.adiciona("C");
			vetor.adiciona("D");
			vetor.adiciona("E");
			vetor.adiciona("F");
			vetor.adiciona("G");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		
		System.out.println(vetor);
	}

}

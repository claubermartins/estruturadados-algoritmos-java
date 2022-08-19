package com.clauber.estruturadados.vetor.teste;

import com.clauber.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) throws Exception {

		Vetor vetor = new Vetor(10);

		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(vetor.busca("Elemento 1"));

	}

}

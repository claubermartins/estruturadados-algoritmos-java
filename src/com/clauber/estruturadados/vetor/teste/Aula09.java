package com.clauber.estruturadados.vetor.teste;

import com.clauber.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) throws Exception {
		Vetor vetor = new Vetor(3);

		try {
			vetor.adiciona("B");
			vetor.adiciona("C");
			vetor.adiciona("D");
			vetor.adiciona("E");
			vetor.adiciona("F");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(vetor);

		vetor.remove(1);

		System.out.println(vetor);

		System.out.println("Remover o elemento E");

		int pos = vetor.busca("J");
		if (pos >= 0) {
			vetor.remove(pos);
		}

		System.out.println(vetor);
	}

}

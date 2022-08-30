package com.clauber.estruturadados.vetor.teste;

import com.clauber.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) throws Exception {
		
		Lista<String> vetor = new Lista(1);
		
		vetor.adiciona("Elemento");
		vetor.adiciona("2");
		
		System.out.println(vetor);
		
		Lista<Contato> vetores = new Lista(1);
		
		Contato c1 = new Contato("Contato 1", "2657-5777", "contato1@gmail.com");
		Contato c2 = new Contato("Contato 2", "4567-9456", "contato2@gmail.com");
		Contato c3 = new Contato("Contato 3", "1234-4321", "contato3@gmail.com");
		
		vetores.adiciona(c3);
		
		System.out.println(vetores);
	}
}
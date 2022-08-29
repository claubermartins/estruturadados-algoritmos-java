package com.clauber.estruturadados.vetor.teste;

import com.clauber.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) throws Exception {

		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contato 1", "2657-5777", "contato1@gmail.com");
		Contato c2 = new Contato("Contato 2", "4567-9456", "contato2@gmail.com");
		Contato c3 = new Contato("Contato 3", "1234-4321", "contato3@gmail.com");
		Contato c4 = new Contato("Contato 3", "1234-4321", "contato3@gmail.com");
		
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
	
		System.out.println(vetor);
		
		int pos = vetor.busca(c4);
		
		if (pos >= 0) {
			System.out.println("Elemento existe no vetor");
		}else{
			throw new Exception("Elemento não existe no vetor");
		}
	}

}

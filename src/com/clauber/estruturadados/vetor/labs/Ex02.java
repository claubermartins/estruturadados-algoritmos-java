package com.clauber.estruturadados.vetor.labs;

import java.util.ArrayList;

import com.clauber.estruturadados.vetor.Lista;

/* Exercício 02
 * Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método lastIndexOf da 
 * classe ArrayList
 */

public class Ex02 {

	public static void main(String[] args) throws Exception {
		
		ArrayList<String> arrayList = new ArrayList<>(5);

		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");

		
		System.out.println(arrayList.lastIndexOf("A"));
		
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		System.out.println(lista.ultimoIndice("A"));
	}

}

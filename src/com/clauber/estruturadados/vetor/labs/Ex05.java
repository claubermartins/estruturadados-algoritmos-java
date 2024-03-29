package com.clauber.estruturadados.vetor.labs;

import java.util.ArrayList;
import com.clauber.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o método limpar, onde todos os elementos da lista são removidos. 
 * Esse método é semelhante ao método clear da classe ArrayList
 */

public class Ex05 {

	public static void main(String[] args) throws Exception {
		
		ArrayList<String> arrayList = new ArrayList<>(5); 
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		
		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);
		
		Lista<String> lista = new Lista<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);
	}

}

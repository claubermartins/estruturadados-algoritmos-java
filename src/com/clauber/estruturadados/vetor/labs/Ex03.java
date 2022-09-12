package com.clauber.estruturadados.vetor.labs;

import com.clauber.estruturadados.vetor.Lista;

/* Melhore a classe Lista e implemente o método remove(T elemento), onde será possível remover 
 * elemento da lista passando o mesmo commo parâmetro.
 * 
 */

public class Ex03 {

	public static void main(String[] args) throws Exception {
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		
		System.out.println(lista);
		
		lista.remove("A");
		
		System.out.println(lista);
		
		lista.remove("E");
		
		System.out.println(lista);
		
		lista.remove("C");
		
		System.out.println(lista);


	}

}

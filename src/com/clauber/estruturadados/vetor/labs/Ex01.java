package com.clauber.estruturadados.vetor.labs;

import com.clauber.estruturadados.vetor.Lista;
/** Exercicío 01
 * 
 * Melhore a classe Lista e implemente o método contém, semelhante ao método contains da classe ArrayList
 * 
 * @author clauber.pinto
 *
 */
public class Ex01 {

	public static void main(String[] args) throws Exception {

		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");

		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));

	}

}

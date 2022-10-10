package com.clauber.estruturadados.pilha.labs;

import com.clauber.estruturadados.pilha.Pilha;

/*
 * Escreva um programa para verificar se uma expressão matemática tem os parênteses agrupados de forma correta, isto é:
 * 1- Se o n° de parenteses à esqueda e à direita são iguais
 * 2- se todo parêntese aberto é seguido posteriormente por um fechamento de parêntese.
 * Exemplos:
 * As expressões ((A+B) ou A+B(violam a condição 1
 * As expressões) A+B(-C OU (A+B))-(C+D violam a condição 2
 * A expressão ((A+B)+D) está ok
 */

public class Ex06 {

	public static void main(String[] args) {
		
		imprimeResultado("A + B");
		imprimeResultado("A + B + (C - D)");
		imprimeResultado("{[()]}[](){()}");
		imprimeResultado("{[(]}[](){()}\"");
		imprimeResultado("A + B + C - D)");
	}

	public static void imprimeResultado(String expressao) {
		System.out.println(expressao + " está baçanceado? " + verificaSimbolosBalanceados(expressao));
	}
	
	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolosBalanceados(String expressao) {

		boolean balanceado = true;
		Pilha<Character> pilha = new Pilha<>();
		int index = 0;
		char simbolo, topo;

		while (index < expressao.length()) {
			simbolo = expressao.charAt(index);

			if (ABRE.indexOf(simbolo) >= 0) {
				pilha.empilha(simbolo);
			} else if (FECHA.indexOf(simbolo) >= 0) {
				if (pilha.estaVazia()) {
					return false;
				} else {
					topo = pilha.desempilha();

					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}

			index++;
		}
		return true;
	}
}

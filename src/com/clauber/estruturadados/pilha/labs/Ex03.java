package com.clauber.estruturadados.pilha.labs;

import com.clauber.estruturadados.pilha.Pilha;

/*
 * Utilize a  classe Pilha(criada nas aulas) e desenvolva os seguintes itens:
 * 1- Crie uma pilha com capacidade para 20 livros.
 * 2- Insira 6 livros na pilha, cada livro contém nome, isbn, ano de lançamento e autor.
 * 3- Crie um exemplo para utilizar cada método da classe Pilha.
 */
public class Ex03 {

	public static void main(String[] args) {
		
		Pilha<Livro> pilha = new Pilha<>(20);
		
		Livro livro1 = new Livro();
		livro1.setNome("Gols de Claubergol");
		livro1.setAutor("Claubergol");
		livro1.setAnoLancamento(2016);
		livro1.setIsbn("KHDGB25552");
		
		Livro livro2 = new Livro();
		livro2.setNome("Gols de Claubergol2");
		livro2.setAutor("Claubergol2");
		livro2.setAnoLancamento(2017);
		livro2.setIsbn("KHDGB255521");
		
		Livro livro3 = new Livro();
		livro3.setNome("Gols de Claubergol3");
		livro3.setAutor("Claubergol3");
		livro3.setAnoLancamento(2018);
		livro3.setIsbn("KHDGB25552");
		
		Livro livro4 = new Livro();
		livro4.setNome("Gols de Claubergol4");
		livro4.setAutor("Claubergol4");
		livro4.setAnoLancamento(2019);
		livro4.setIsbn("KHDGB255523");
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Empilhando livros na pilha");
		
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		
		System.out.println(pilha.tamanho() + " livros foram empilhados: ");
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Espiando o topo da pilha" + pilha.topo());
		
		System.out.println("Desempilhando livros da pilha: ");
		
		while (!pilha.estaVazia()) {
			System.out.println("Desempilhando livro: " + pilha.desempilha());
		}
		
		System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());
	}

}

















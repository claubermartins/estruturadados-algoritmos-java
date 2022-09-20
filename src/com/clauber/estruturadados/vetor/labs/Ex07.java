package com.clauber.estruturadados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.clauber.estruturadados.vetor.teste.Contato;
/*
 * Utilize a classe ArrayList e desenvolva os seguintes itens:
 * 1. Crie uma lista utilizando a classe ArrayList da API do java;
 * 2. Passe todos os contatos do vetor para o ArrayList;
 * 3. Crie um exemplo para utilizar cada método da classe ArrayList (somente os métodos que implementamos de forma similar na classe ArrayList)
 */

public class Ex07 extends Ex06 {

	public static void main(String[] args) throws Exception {

		// criação das variáveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		ArrayList<Contato> lista = new ArrayList<>(20);

		// criar e adicionar 30 contatos
		criarContatosDinamicamente(5, lista);

		// criar um menu para que o usuário escolha a opção
		int opcao = 1;
		while (opcao != 0) {
			opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;

			case 2:
				adicionarContatoPosicao(scan, lista);
				break;

			case 3:
				obtemContatoPosicao(scan, lista);
				break;

			case 4:
				obtemContato(scan, lista);
				break;

			case 5:
				pesquisarUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisarContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				imprimeTamanhoVetor(lista);
				break;
			case 10:
				limpaVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;
			default:
				break;
			}

		}

		System.out.println("O usuário digitou 0, então o programa terminou.");
	}

	private static void imprimirVetor(ArrayList<Contato> lista) {

		System.out.println(lista);
	}

	private static void limpaVetor(ArrayList<Contato> lista) {

		lista.clear();

		System.out.println("Todos os contatos foram excluídos");
	}

	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {

		System.out.println("Tamanho do vetor é: " + lista.size());
	}

	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {
			Contato contato = lista.get(posicao);

			lista.remove(contato);

			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {
			lista.remove(posicao);

			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao pesquisada", scan);

		try {
			Contato contato = lista.get(posicao);

			System.out.println("Contato existe, seguem os dados:");
			System.out.println(contato);

			boolean existe = lista.contains(contato);

		}catch (Exception e) {
			System.out.println("Contato não existe!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao pesquisada", scan);

		try {
			Contato contato = lista.get(posicao);

			System.out.println("Contato existe, seguem os dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do ultimo índice do contato encontrado:");
			posicao = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição" + posicao);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao pesquisada", scan);

		try {
			Contato contato = lista.get(posicao);

			System.out.println("Contato existe, seguem os dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			posicao = lista.indexOf(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao pesquisada", scan);

		try {
			Contato contato = lista.get(posicao);

			System.out.println("Contato encontrado na posição" + posicao);
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) throws Exception {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre com o telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.add(contato);

		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre com o telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int posicao = lerInformacaoInt("Entre com a posicao a adicionar o contato", scan);

		try {
			lista.add(posicao, contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}

	}

	private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) throws Exception {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato" + i);
			contato.setTelefone("225566" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.add(contato);
		}
	}
}

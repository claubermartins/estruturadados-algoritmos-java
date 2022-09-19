package com.clauber.estruturadados.vetor.labs;

import java.util.Scanner;

import com.clauber.estruturadados.vetor.Lista;
import com.clauber.estruturadados.vetor.teste.Contato;

/*
 * Utilize a classe Lista ou Vetor e classe contato (criada durante as aulas e desenvolva os seguintes items:
 * 1- Crie um vetor com capacidade para 20 contatos;
 * 2- Insira 30 contatos no vetor(isso é possível ser feito através de um loot);
 * Crie um exemplo para utilizar cada método da classe Lista
 */

public class Ex06 {

	public static void main(String[] args) throws Exception {

		// criação das variáveis
		Scanner scan = new Scanner(System.in);

		// criar vetor com 20 de capacidade
		Lista<Contato> lista = new Lista<>(20);

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

	private static void imprimirVetor(Lista<Contato> lista) {

		System.out.println(lista);
	}

	private static void limpaVetor(Lista<Contato> lista) {

		lista.limpar();

		System.out.println("Todos os contatos foram excluídos");
	}

	private static void imprimeTamanhoVetor(Lista<Contato> lista) {

		System.out.println("Tamanho do vetor é: " + lista.tamanho());
	}

	private static void excluirContato(Scanner scan, Lista<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {
			Contato contato = lista.busca(posicao);

			lista.remove(contato);

			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao a ser removida", scan);

		try {
			lista.remove(posicao);

			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao pesquisada", scan);

		try {
			Contato contato = lista.busca(posicao);

			System.out.println("Contato existe, seguem os dados:");
			System.out.println(contato);

			boolean existe = lista.contem(contato);

		}catch (Exception e) {
			System.out.println("Contato não existe!");
		}
	}

	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao pesquisada", scan);

		try {
			Contato contato = lista.busca(posicao);

			System.out.println("Contato existe, seguem os dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do ultimo índice do contato encontrado:");
			posicao = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posição" + posicao);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContato(Scanner scan, Lista<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao pesquisada", scan);

		try {
			Contato contato = lista.busca(posicao);

			System.out.println("Contato existe, seguem os dados:");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado:");
			posicao = lista.busca(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {

		int posicao = lerInformacaoInt("Entre com a posicao pesquisada", scan);

		try {
			Contato contato = lista.busca(posicao);

			System.out.println("Contato encontrado na posição" + posicao);
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) throws Exception {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre com o telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		lista.adiciona(contato);

		System.out.println("Contato adicionado com sucesso!");
		System.out.println(contato);
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {

		System.out.println("Criando um contato, entre com as informações:");
		String nome = lerInformacao("Entre com o nome", scan);
		String telefone = lerInformacao("Entre com o telefone", scan);
		String email = lerInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int posicao = lerInformacaoInt("Entre com a posicao a adicionar o contato", scan);

		try {
			lista.adiciona(posicao, contato);
			System.out.println("Contato adicionado com sucesso!");
			System.out.println(contato);

		} catch (Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}

	}

	private static String lerInformacao(String msg, Scanner scan) {

		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	private static int lerInformacaoInt(String msg, Scanner scan) {

		boolean entradaValida = false;
		int num = 0;

		while (!entradaValida) {
			try {

				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}
		}

		return num;
	}

	private static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {

			System.out.println("Digite a opção desejada:");
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Obtém contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índice do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: Imprime vetor");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao >= 0 && opcao <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente\n\n");
			}

		}

		return opcao;

	}

	private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) throws Exception {

		Contato contato;

		for (int i = 1; i <= quantidade; i++) {
			contato = new Contato();
			contato.setNome("Contato" + i);
			contato.setTelefone("225566" + i);
			contato.setEmail("contato" + i + "@email.com");

			lista.adiciona(contato);
		}
	}
}

package com.clauber.estruturadados.vetor;

public class Lista<T> {
	
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista() {
		this(10);
	}

	public void adiciona(T elemento) throws Exception {
		
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("O vetor j� est� cheio, n�o � poss�vel adicionar mais elementos");
		}
	}
	
	public boolean adiciona(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos =(T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i]= this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	public T obtem(int posicao) {
		return this.busca(posicao);
	}
	
	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
	}
	
	public int busca(T elemento) throws Exception {
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		throw new Exception("O vetor não existe");
		
	}
	
	public boolean contem(T elemento) throws Exception {
		
//		int posicao = busca(elemento);
//		if (posicao > -1) {
//			return true;
//		}
//		return false;
		
		return busca(elemento) >= 0;
	}
	
	public int ultimoIndice(T elemento) {
		
		int ultimaPosicao = -1;
		for(int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				ultimaPosicao = i;
			}
		}
		return ultimaPosicao;
	}
	
	//B G D E F -> posição a ser removida é 1 (G)
	//0 1 2 3 4 -> tamanho é 5
	//VETOR[1] = VETOR[2]
	//VETOR[2] = VETOR[3]
	//VETOR[3] = VETOR[4]
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void remove(T elemento) throws Exception  {
		int posicao = this.busca(elemento);
		if (posicao >= 0) {
			this.remove(posicao);
		}
	}
	
	public void limpar() {
//		//opcao 1
//		this.elementos = (T[]) new Object[this.elementos.length];
//		
//		//opção 2
//		
//		this.tamanho = 0;
		
		//opção 3
		
		for (int i=0; i<this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}
}

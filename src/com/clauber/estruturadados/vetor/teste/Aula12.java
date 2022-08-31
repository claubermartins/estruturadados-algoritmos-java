package com.clauber.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
	
	public static void main(String[] args) throws Exception {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		if(existe) {
			System.out.println("O elemento existe no array");
		}else {
			throw new Exception ("O elemento não existe no array");
		}
		
		int posicao = arrayList.indexOf("B");
		if(posicao >= 0) {
			System.out.println("Elemento existe no array na posição " + posicao);
		}else {
			throw new Exception("Elemento não existe no array " + posicao);
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0); 
		arrayList.remove("B"); 
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());

	}
}


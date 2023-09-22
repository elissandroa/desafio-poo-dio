package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Curso Java","descrição curso java",8);
		Curso curso2 = new Curso("Curso JavaScript","descrição curso js",4);
		System.out.println(curso1);
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria("Mentoria Java", "descricão mentoria Java", LocalDate.now());
		Mentoria mentoria2 = new Mentoria("Mentoria JavaScript", "descricão mentoria JS", LocalDate.now());
		

		System.out.println(mentoria1);
		System.out.println(mentoria2);		
	}

}

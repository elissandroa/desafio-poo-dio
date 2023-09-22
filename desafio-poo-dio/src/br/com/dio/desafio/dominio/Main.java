package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Curso Java","descrição curso java",8);
		Curso curso2 = new Curso("Curso JavaScript","descrição curso js",4);

		
		
		Mentoria mentoria1 = new Mentoria("Mentoria Curso Java", "Descrição mentoria curso Java",LocalDate.now());
		
				
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos "+devCamila.getNome()+": "+devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos "+devCamila.getNome()+": "+devCamila.getConteudosInscritos());
		System.out.println("Conteúdos concluídos "+devCamila.getNome()+": "+devCamila.getConteudosConcluidos());
		System.out.println("XP: "+devCamila.calcularXp());
		
		System.out.println("-----------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos "+devJoao.getNome()+": "+devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos "+devJoao.getNome()+": "+devJoao.getConteudosInscritos());
		System.out.println("Conteúdos concluídos "+devJoao.getNome()+": "+devJoao.getConteudosConcluidos());
		System.out.println("XP: "+devJoao.calcularXp());
		

	}

}

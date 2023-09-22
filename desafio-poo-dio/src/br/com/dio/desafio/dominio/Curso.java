package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo {

	private int cargaHoraria;
	
	public Curso() {
	}

	public Curso(String titulo, String descricao, int cargaHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double CalcularXP() {
		return XP_PADRAO * cargaHoraria;
	}



	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(titulo, other.titulo);
	}
	
	@Override
	public String toString() {
		return "Curso:" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}
	
}

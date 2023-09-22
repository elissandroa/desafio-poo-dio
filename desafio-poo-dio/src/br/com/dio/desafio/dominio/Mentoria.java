package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo{

	private LocalDate data;
	
	public Mentoria() {
	}
	

	public Mentoria(String titulo, String descricao, LocalDate data) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}


	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public double CalcularXP() {
		return  XP_PADRAO + 20d;
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
		Mentoria other = (Mentoria) obj;
		return Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
	}

}

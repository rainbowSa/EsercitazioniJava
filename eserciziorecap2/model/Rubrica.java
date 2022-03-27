package com.azienda.eserciziorecap2.model;


import java.util.Collections;
import java.util.List;
import java.util.Objects;

public  class Rubrica {
	private String nome;
	private String anno;
	List<Contatto> contatto;
	
	public Rubrica(String nome, String anno, List<Contatto> contatto) {
		super();
		this.nome = nome;
		this.anno = anno;
		this.contatto = contatto;
	}

	public List<Contatto> getContatto() {
		return contatto;
	}

	public void setContatto(List<Contatto> contatto) {
		this.contatto = contatto;
	}

	public String getNome() {
		return nome;
	}

	public String getAnno() {
		return anno;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return "Rubrica [Nome:" + nome + "anno: " + anno + ", contatti=" + contatto;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(anno, contatto, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rubrica other = (Rubrica) obj;
		return Objects.equals(anno, other.anno) && Objects.equals(contatto, other.contatto)
				&& Objects.equals(nome, other.nome);
	}

	public static void printList(List<Contatto> lista) {
		for(Contatto c : lista) {
			System.out.println(c + " ");
		}
		System.out.println();
	}

	
	
	
	
	
	
	
}

package com.azienda.eserciziorecap2.model;

import java.util.Objects;

public class Contatto implements Comparable<Contatto>{
	private String nome;
	private String cognome;
	private String telefono;
	
	public Contatto(String nome, String cognome, String telefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.telefono = telefono;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " Cognome: " + this.cognome + " telefono: " + this.telefono;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cognome, nome, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contatto other = (Contatto) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(nome, other.nome)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public int compareTo(Contatto o) {
		return nome.compareTo(o.getNome());
	}
	
	
	
	
	
	
}

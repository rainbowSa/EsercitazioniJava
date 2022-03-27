package com.azienda.esercizioRecap.model;

import java.util.Objects;

public abstract class Veicolo {
	private String modello;
	private Float speed;
	
	public Veicolo(String modello, Float speed) {
		this.modello = modello;
		this.speed = speed;
	}

	//Get e Set
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}

	public Float getSpeed() {
		return speed;
	}
	public void setSpeed(Float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Il modello del veicolo è " + this.modello + " la sua velocità è " + this.speed;
	}

	//Equals e Hashcode
	@Override
	public int hashCode() {
		return Objects.hash(modello, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Veicolo))
			return false;
		Veicolo other = (Veicolo) obj;
		return Objects.equals(modello, other.modello) && Objects.equals(speed, other.speed);
	}
}

package com.azienda.esercizioRecap.model;

import java.util.Objects;

public class Aereo extends Veicolo {
	private Boolean diLinea;
	
	public Aereo(String modello, Float speed, Boolean diLinea) {
		super(modello, speed);
		this.diLinea = diLinea;
	}

	//Get e Set
	public Boolean getDiLinea() {
		return diLinea;
	}
	public void setDiLinea(Boolean diLinea) {
		this.diLinea = diLinea;
	}

	@Override
	public String toString() {
		String msg = diLinea? " Aereo di Linea. " : " Aereo Privato. ";
		return   "Aereo: " +  super.toString() + msg;
	}

	//Equals e hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(diLinea);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Aereo))
			return false;
		Aereo other = (Aereo) obj;
		return Objects.equals(diLinea, other.diLinea);
	}
	
	//Metodo vola
	public void vola() {
		System.out.println(toString() + " L'aereo è in volo!!");
	}
	
	
	
}

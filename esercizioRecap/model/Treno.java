package com.azienda.esercizioRecap.model;

import java.util.Objects;

public class Treno extends Veicolo{
	private Boolean regionale;

	public Treno(String modello, Float speed, Boolean regionale) {
		super(modello, speed);
		this.regionale = regionale;
	}

	//Get e set
	public Boolean getRegionale() {
		return regionale;
	}
	public void setRegionale(Boolean regionale) {
		this.regionale = regionale;
	}

	@Override
	public String toString() {
		String msg = regionale? " Treno regionale. " : " Treno a lunga percorrenza. ";
		return  "Treno: " + super.toString() + msg;
	}

	//Equals e hascode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(regionale);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Treno))
			return false;
		Treno other = (Treno) obj;
		return Objects.equals(regionale, other.regionale);
	}
	
	public void percorreBinari() {
		System.out.println(toString() + "Il treno è fermo in stazione");
	}
	
	
	
	
	

}

package com.azienda.eserciziorecap2.model;

import java.util.Comparator;

public class CognomeComparator implements Comparator<Contatto> {

	@Override
	public int compare(Contatto o1, Contatto o2) {
		return o1.getCognome().compareTo(o2.getCognome());
	}

}

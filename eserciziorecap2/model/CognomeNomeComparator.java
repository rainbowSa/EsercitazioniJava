package com.azienda.eserciziorecap2.model;

import java.util.Comparator;

public class CognomeNomeComparator implements Comparator<Contatto> {

	@Override
	public int compare(Contatto o1, Contatto o2) {
		int c = o1.getCognome().compareTo(o2.getCognome());
		if(c==0) {
			c = o1.getNome().compareTo(o2.getNome());
		}
	 return c;
	}

}

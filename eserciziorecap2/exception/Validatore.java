package com.azienda.eserciziorecap2.exception;

import com.azienda.eserciziorecap2.model.Contatto;
import com.azienda.eserciziorecap2.model.Rubrica;

public class Validatore {
	public static void checkNumero (String s, Rubrica r) throws ContattoNonValido {
		for(Contatto c : r.getContatto()) {
			if (s.equals(c.getTelefono())){
				throw new ContattoNonValido("Errore numero già presente in rubrica", null);
			}
		}
	}

	public static Contatto checkContatto (Contatto c, Rubrica r) throws ContattoNonValido {
		for(Contatto cont : r.getContatto()) {
			if (cont.equals(c)){
				return cont;
			}
		}
		throw new ContattoNonValido("Errore il contatto non esiste", null);
	}
}


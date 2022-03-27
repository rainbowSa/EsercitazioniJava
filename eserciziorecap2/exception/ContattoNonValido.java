package com.azienda.eserciziorecap2.exception;

public class ContattoNonValido extends Exception {
	private String messaggio;
	private Throwable ex;
	
	public ContattoNonValido (String messaggio, Throwable ex) {
		super (messaggio,ex);
	}
	
}

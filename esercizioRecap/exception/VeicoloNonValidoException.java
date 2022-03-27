package com.azienda.esercizioRecap.exception;

public class VeicoloNonValidoException extends Exception {
	private String messaggio;
	private Throwable ex;
	
	public VeicoloNonValidoException (String messaggio, Throwable ex) {
		super (messaggio,ex);
	}
	
}

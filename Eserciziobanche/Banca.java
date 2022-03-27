package com.azienda.classiAvanzate.parteC.esercizi.banche;

public interface Banca {
	public static final String  CONTO_FILIALE = "Conto filiale"; //dovremmo confrontare un conto con queste costanti
	public static final String CONTO_ONLINE = "Conto online"; //potrei non mettere public static perchè lo mette di default
	
	public Double getSaldo();
	public Double getTassoInt();
	public Double getSaldoEffettivo();
	
	
	//creo un metodo di default perchè questo metodo è uguale in entrambe le banche oppure creo una classe Astratta
	//public default  Double getSaldoEffettivo() { 
	//return getSaldo() + getSaldo() * getTassoInt();}
	
}
	


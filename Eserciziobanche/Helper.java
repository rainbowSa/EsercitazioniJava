package com.azienda.classiAvanzate.parteC.esercizi.banche;

public abstract class Helper implements Banca {
	private Double saldo; 
	protected String tipologiaConto; //per richiamare le costanti nell'interfaccia, protetto così anche le figlie ci possono accedere
	
	//Costruttore
	public Helper (Double saldo, String tipologiaConto) {
		this.saldo = saldo;
		this.tipologiaConto = tipologiaConto;
	}

	@Override
	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldoEffettivo() { 
		return getSaldo() + getSaldo() * getTassoInt();
	}
}
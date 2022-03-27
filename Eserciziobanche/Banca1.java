package com.azienda.classiAvanzate.parteC.esercizi.banche;

public class Banca1 extends Helper{


	//Costruttore
	public Banca1 (Double saldo, String tipologiaConto) {
		super (saldo, tipologiaConto);
	}

	@Override
	public Double getTassoInt() {
		if (this.tipologiaConto.equals(Banca.CONTO_ONLINE)) {
			return 0.02; //tasso interesse online 
		}
		return 0.01; //tasso interesse filiale

	}





}

package com.azienda.classiAvanzate.parteC.esercizi.banche;

public class Banca2 extends Helper{
	//Costruttore
	public Banca2 (Double saldo, String tipologiaConto) {
		super (saldo, tipologiaConto);
	}

	@Override
	public Double getTassoInt() {
		if (this.tipologiaConto.equals(Banca.CONTO_ONLINE)) {
			return 0.03; 
		}
		return 0.02; 

	}

}



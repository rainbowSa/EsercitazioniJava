package com.azienda.esercizioRecap.businessLogic;

import com.azienda.esercizioRecap.model.Veicolo;

public abstract class Helper implements CalcolaTempi {
	
	@Override
	public Float calcolaTempiPercorrenza(Veicolo veicolo, Float distanza) {
		Float tempo = distanza/veicolo.getSpeed();
		System.out.println("Il tempo di percorrenza è: "+ tempo);
		return tempo;
	}

}

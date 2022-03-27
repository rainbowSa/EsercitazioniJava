package com.azienda.esercizioRecap.businessLogic;

import com.azienda.esercizioRecap.model.Aereo;
import com.azienda.esercizioRecap.model.Veicolo;

public class CalcoloTempiAereo extends Helper {

	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		if (veicolo instanceof Aereo) {
			((Aereo) veicolo).vola();
		}
	}

}

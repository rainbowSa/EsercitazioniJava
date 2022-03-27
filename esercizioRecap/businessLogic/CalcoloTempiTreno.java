package com.azienda.esercizioRecap.businessLogic;

import com.azienda.esercizioRecap.model.Treno;
import com.azienda.esercizioRecap.model.Veicolo;

public class CalcoloTempiTreno extends Helper{

	@Override
	public void informazioniMovimento(Veicolo veicolo) {
		if (veicolo instanceof Treno) {
			((Treno) veicolo).percorreBinari();
		}
	}	
}



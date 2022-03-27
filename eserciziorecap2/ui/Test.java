package com.azienda.eserciziorecap2.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.azienda.eserciziorecap2.model.CognomeComparator;
import com.azienda.eserciziorecap2.model.CognomeNomeComparator;
import com.azienda.eserciziorecap2.model.Contatto;
import com.azienda.eserciziorecap2.model.Rubrica;
import com.azienda.eserciziorecap2.utility.Utility;

public class Test {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			Integer scelta = -1;

			List<Contatto> contatti = new ArrayList<Contatto>();
			contatti.add(new Contatto ("Samantha", "Mangeruca", "3458521522"));
			contatti.add(new Contatto ("Sam", "Man", "34487522"));

			Rubrica rub = new Rubrica("Pinco", "2022", contatti);	

			do {
				System.out.println("Scegli cosa fare: \n1: Inserisci nuovo contatto 2: Aggiornare un contatto"
						+ " \n3: Modifica contatto esistente 4: Cancella contatto"
						+ "\n5: Ricerca per nome 6: Ricerca per cognome \n7: Ricerca per numero 8: Stampe \n0: esci");

				scelta = sc.nextInt();
				if(scelta ==0) {
					System.out.println("Programma terminato");
				}
				else {
					switch(scelta) {
					case 1:
						System.out.println(Utility.nuovoContatto(sc, rub));
						break;
					case 2:
						System.out.println(Utility.updateContatto(sc, rub));
						break;
					case 3:
						System.out.println(Utility.modifica(sc, rub));
						break;
					case 4:
						System.out.println(Utility.eliminaContatto(sc, rub));
						break;
					case 5:
						Utility.ricercaNome(sc, rub);
						break;
					case 6:
						Utility.ricercaCognome(sc, rub);
						break;
					case 7:
						Utility.ricercaTelefono(sc, rub);
						break;

					case 8:
						rub.printList(contatti);
						
						Collections.sort(contatti);
						rub.printList(contatti);
						
						Collections.sort(contatti, new CognomeComparator());
						rub.printList(contatti);
						
						Collections.sort(contatti, new CognomeNomeComparator());
						rub.printList(contatti);
						break;
					}
				}
			}while (scelta!=0);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
		
}




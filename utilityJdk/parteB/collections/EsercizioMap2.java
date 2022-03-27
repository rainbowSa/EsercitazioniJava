package com.azienda.utilityJdk.parteb.esercizi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EsercizioMap2 {

	public static void main(String[] args) {
		try (Scanner num = new Scanner (System.in)){
			Map<Integer, String> mappa = new HashMap<Integer, String>();
		
			System.out.println("Inserisci un numero:");
			Integer n = num.nextInt();
			//Avrei potuto fare il controllo che effettivamente quello inserito
			// era un numero.
			//Potevo fare un metodo riempi mappa mettendo dentro questo ciclo for.
			for (int i = 0; i <= n; i++) {
				mappa.put(i, "ciao_" + i);
			}
				
			printKey(mappa);
			printKeyValue(mappa);
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void printKey(Map<Integer, String> map) {
		Set<Integer> setKey = map.keySet();
		for (Integer key : setKey) {
			System.out.println("La chiave è: " + key);
		}
	}
	
	private static void printKeyValue(Map<Integer, String> map) {
		Set<Entry<Integer, String>> setEntry = map.entrySet();
		for(Entry<Integer, String> entry : setEntry) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " --> " + value);
		}
	}
}

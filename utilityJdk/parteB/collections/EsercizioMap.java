package com.azienda.utilityJdk.parteb.esercizi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class EsercizioMap {

	public static void main(String[] args) {
		try (Scanner num = new Scanner (System.in)){
			Map<Integer, String> mappa = new HashMap<Integer, String>();
			Integer n = -1;
			
			while(n != 0) {
				System.out.println("Inserisci un numero:");
				n = num.nextInt();
				if(n==0) {
					System.out.println("Inserimento completato");
				}
				else {
					for (int i = 0; i <= n; i++) {
						mappa.put(n, "ciao_" + i);
					}
				}
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

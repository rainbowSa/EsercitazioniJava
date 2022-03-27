package com.azienda.utilityJdk.parteb.esercizi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EsercizioSet {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			final String ESCI = "esc";
			String parola = "";
			Set<String> set = new HashSet<String>();
			
			while (!parola.equalsIgnoreCase(ESCI)) {
				System.out.println("Inserisci una parola oppure scrivi ESC per uscire dall'inserimento parole");
				parola = sc.next();
				
				if(parola.equalsIgnoreCase(ESCI)) {
					System.out.println("Inserimento Terminato");
				}
				else {
					set.add(parola);
				}
				
			}
			
			System.out.println("Metodo1");
			printSet(set);
			System.out.println("Metodo2");
			printSet2(set);
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void printSet(Set<String> set) {
		for(String s : set) {
			System.out.println(s);
		}
	}
	
	private static void printSet2(Set<String> set) {
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
	}

}

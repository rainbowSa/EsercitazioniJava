package com.azienda.utilityJdk.parteb.esercizi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EsercizioList {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			final String ESCI = "esc";
			String parola = "";
			List<String> lista = new ArrayList<String>();
		
		while (!parola.equalsIgnoreCase(ESCI)) {
			System.out.println("Inserisci una parola oppure scrivi ESC per uscire dall'inserimento parole");
			parola = sc.next();
			
			if(parola.equalsIgnoreCase(ESCI)) {
				System.out.println("Inserimento Terminato");
			}
			else {
				lista.add(parola);
			}
			
		}
		
			System.out.println("Metodo 1");
			printList(lista);
			System.out.println("Metodo 2");
			printList2(lista);
			System.out.println("Metodo 3");
			printList3(lista);
		
		} 
		catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	private static void printList(List<String> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println("Parola " + i + " " + list.get(i));
		}
	}
		
	private static void printList2(List<String> list) {
		for(String s : list) {
			System.out.println("Parola: " + s);
		}
	}
	
	private static void printList3(List<String> list) {
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
		}
	}
	
	

}

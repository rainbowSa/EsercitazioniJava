package com.azienda.eserciziorecap2.utility;

import java.util.Scanner;

import com.azienda.eserciziorecap2.exception.ContattoNonValido;
import com.azienda.eserciziorecap2.exception.Validatore;
import com.azienda.eserciziorecap2.model.Contatto;
import com.azienda.eserciziorecap2.model.Rubrica;



public class Utility {
	
	public static String nuovoContatto(Scanner sc, Rubrica r) {
		while(true) {
			System.out.println("Inserisci nome: ");
			String nome = sc.next();
			System.out.println("Inserisci cognome: ");
			String cognome = sc.next();
			System.out.println("Inserisci numero: ");
			String numero = sc.next();
			
			try {
				Validatore.checkNumero(numero,r);
				Contatto c = new Contatto(nome, cognome, numero);
				r.getContatto().add(c);
				return "Contatto inserito corretamente";
				
			} catch (Exception e) {
				System.out.println("Il numero inserito c'è già");
			}
			
		} 
	}
	
	public static String updateContatto(Scanner sc, Rubrica r) {
		System.out.println("Inserisci nome: ");
		String nome = sc.next();
		System.out.println("Inserisci cognome: ");
		String cognome = sc.next();
		System.out.println("Inserisci numero: ");
		String numero = sc.next();
		
		Contatto contatto = new Contatto(nome, cognome, numero);
		
		try {
			Validatore.checkContatto(contatto, r);
			
			System.out.println("Inserisci nuovo nome: ");
			nome = sc.next();
			System.out.println("Inserisci nuovo  cognome: ");
			cognome = sc.next();
			System.out.println("Inserisci nuovo numero: ");
			numero = sc.next();
			
			Contatto c = new Contatto(nome, cognome, numero);
			r.getContatto().remove(contatto);
			r.getContatto().add(c);
			
			return "Modifica inserita corretamente";
		} 
		catch (Exception e) {
			System.out.println("Errore");
		}
		return "Errore";
		
	}
	
	public static String modifica (Scanner sc, Rubrica r)  {
		Integer scelta = -1;
		
		System.out.println("Inserisci nome: ");
		String nome = sc.next();
		System.out.println("Inserisci cognome: ");
		String cognome = sc.next();
		System.out.println("Inserisci numero: ");
		String numero = sc.next();
		
		Contatto contatto = new Contatto(nome, cognome, numero);
		try {
			Contatto contattoAggiorno = Validatore.checkContatto(contatto, r);
			while (scelta!=0) {
				System.out.println("Cosa vuoi modificare? 1.Nome 2.Cognome 3.Numero 0.Esci");
				scelta = sc.nextInt();
				
				switch(scelta) {
					case 1: 
						System.out.println("Inserisci nuovo nome:");
						nome = sc.next();
						contattoAggiorno.setNome(nome);
						break;
					case 2: 
						System.out.println("Inserisci nuovo cognome:");
						cognome = sc.next();
						contattoAggiorno.setCognome(cognome);
						break;
					case 3: 
						System.out.println("Inserisci nuovo numero:");
						numero = sc.next();
						contattoAggiorno.setTelefono(numero);
						break;
				}
				return "Modifica effetuata";
			}
		} 
		catch (ContattoNonValido e) {
			e.printStackTrace();
		}
		return "Errore";
	}
		
	public static String eliminaContatto(Scanner sc, Rubrica r) {
		while(true) {
			System.out.println("Inserisci nome: ");
			String nome = sc.next();
			System.out.println("Inserisci cognome: ");
			String cognome = sc.next();
			System.out.println("Inserisci numero: ");
			String numero = sc.next();
			
			Contatto c = new Contatto(nome, cognome, numero);
			
			try {
				Validatore.checkContatto(c, r);
			} catch (Exception e) {
				System.out.println("Il numero inserito c'è già");
			}
			
			if (r.getContatto().remove(c)) {
				return "Contatto eliminato corretamente";
			}
			return "Si è verificato un problema";
		} 
	}
	
	public static void ricercaNome(Scanner sc, Rubrica r) {
		System.out.println("Inserisci nome: ");
		String parola = sc.next();
		
		for(Contatto c : r.getContatto()) {
			if(c.getNome().contains(parola)) {
				System.out.println(c);
			}
		}
	}
	
	public static void ricercaCognome(Scanner sc, Rubrica r) {
		System.out.println("Inserisci cognome: ");
		String parola = sc.next();
		
		for(Contatto c : r.getContatto()) {
			if(c.getCognome().contains(parola)) {
				System.out.println(c);
			}
			
		}
	}
	
	public static void ricercaTelefono(Scanner sc, Rubrica r) {
		System.out.println("Inserisci numero di telefono: ");
		String parola = sc.next();
		
		for(Contatto c : r.getContatto()) {
			if(c.getTelefono().contains(parola)) {
				System.out.println(c);
			}
		}
	}
		
		
		
		
	}
	
	


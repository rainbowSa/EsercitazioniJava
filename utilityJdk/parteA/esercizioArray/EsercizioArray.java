package com.azienda.utilityJdk.parteA.esercizioArray;

import java.util.Scanner;

public class EsercizioArray {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Inserisci la dimensione dell'array (NB: deve essere un numero)");
			int a = 0;
			try {
				a = Integer.parseInt(sc.nextLine());
			}
			catch (NumberFormatException ex) {
				System.out.println("Non hai inserito un numero");
			}

			Integer[] array = new Integer [a];
			riempiArray(array);
			printArray(array);
		
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	//metodi
	private static void riempiArray(Integer[] ar) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (i*i);
		}
	}

	private static void printArray (Integer[] ar) { //Enhanced for 
		for (int elemento : ar) {
			System.out.print(elemento +"\t");
		}
	}



}

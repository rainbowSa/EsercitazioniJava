package com.azienda.utilityJdk.parteA.esercizioArray2;

import java.util.Scanner;

public class EsercizioArray2 {

	public static void main(String[] args) {
		try (Scanner num = new Scanner(System.in)){
			int n = controllo(num);
			
			int [][] matrice = new int[n][n];
			riempiArray(matrice);
			printArray(matrice);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//Metodi
	private static int controllo(Scanner sc) {
		int a = 0;
		while(a <= 0 ) {
			System.out.println("Inserire un numero positivo: ");
			String s = sc.next();
			try{
				a = Integer.parseInt(s);
				if ( a <= 0 ) {
					System.out.println("Il numero inserito è minore o uguale a 0, prego inserisca un numero positivo.");
				}
			}
			catch (NumberFormatException e) {
				System.out.println("ERRORE. Non hai inserito un numero, riprova.");
			}
		} 
		return a;
	}
	
	private static void riempiArray (int[][] matrice) {
		for (int i = 0; i < matrice.length; i++) {
			for(int j = 0; j < matrice[i].length; j++ ) {
				if (i==j) {
					matrice[i][j] =1;
				}
				else {
					matrice[i][j] =0;
				}
			}
		}
	}
	
	private static void printArray (int[][] matrice) { 
		for(int[] riga : matrice) { 
			for (int elemento : riga) { 
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}

}

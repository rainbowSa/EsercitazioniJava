package com.azienda.utilityjdk.parteA.esercizi;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EsercizioDate {

	public static void main(String[] args) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			try {
				LocalDateTime data = LocalDateTime.parse("01/01/2022 12:30", formatter);
				String dataCorretta = data.format(formatter);
				System.out.println(dataCorretta);
				
				LocalDateTime dataOra = LocalDateTime.now();
				String dataOraCorretta = dataOra.format(formatter);
				System.out.println("Data e ora di esecuzione del programma: " + dataOraCorretta);
			}
			catch (DateTimeException es) {
				System.out.println("Errore, la formattazione della data non è riuscita");
				es.printStackTrace(); 
			}
			
		} catch (Exception e) {
			System.out.println("Errore generico");
			e.printStackTrace();
		}
			
		
	}

}
/* Metodi diversi per settare una data che mi interessa:
 * data = LocalDateTIme.of(2020,1,1,12,30);
 * data = LocalDateTime.of(LocalDate.of(2020,1,1), LocalTimeof(12,30));
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

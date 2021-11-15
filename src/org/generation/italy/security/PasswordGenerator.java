package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String nome="Mattia",cognome="Loiacono",colore="blu";
		int giorno=12,mese=7,anno=2001;
		int data=giorno+mese+anno;
		String password=nome+"-"+cognome+"-"+colore+"-"+data;
		System.out.println("La tua password è: "+password);
	}
	
}

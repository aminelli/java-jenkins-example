package com.corso.jenkins;

public class App {

	public String play(int number) {
		// Check su numero
		if (number == 0) throw new IllegalArgumentException("Indicare un numero diverso da 0");
		
		if (number % 3 == 0) return "Divisibile per 3";
		if (number % 5 == 0 ) return "Divisibile per 5";
		
		return String.valueOf(number);
	}	
	
	
}

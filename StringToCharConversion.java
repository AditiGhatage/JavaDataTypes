package com.datatypecasting;

public class StringToCharConversion {

	// String to Char Conversion
	public void StringToChar() {
		// int i = 0;
		String stringExample = "WELCOME";
		char characters = stringExample.charAt(0);
		System.out.println("Char at " + 0 + " index is " + characters);

		if (characters == 'W') {
			System.out.println("Conversion is successful");
		} else {
			System.out.println("Conversion is unsuccessful");
		}

		System.out.println("The converted Char is: " + characters);
	}

	// Char to String Conversion
	public void CharToString() {
		char charSea = 'S';
		String stringHoliday = Character.toString(charSea);

		System.out.println("The converted String is: " + stringHoliday);

	}

}

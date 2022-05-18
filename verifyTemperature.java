package com.datatypecasting;

public class verifyTemperature {
	// String to double conversion
	public void verifytemp(String strTemp) {
		double doubletemp = 36.7;
		double doubleconvertedTemp = Double.parseDouble(strTemp);

		if (doubleconvertedTemp > doubletemp) {
			System.out.println("Temperature is high.");
		} else {
			System.out.println("Temperature is low.");
		}
	}

	// double to string conversion
	public void verifydoubletoString() {
		double doublenumber = 24.567d;
		String convertTemp = String.valueOf(doublenumber);

		System.out.println(convertTemp);
	}
}

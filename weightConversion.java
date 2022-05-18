package com.datatypecasting;

public class weightConversion {
	// string to float conversion
	public void verifyweight(String StrWt) {
		float fweight = 46.80f;
		float fconvertedweight = Float.parseFloat(StrWt);

		if (fconvertedweight > fweight) {
			System.out.println("Weight is more.");
		} else {
			System.out.println("Weight is low.");
		}
	}

	// Float to string conversion
	public void verifyfloatconversion() {
		float floatweight = 67.8f;
		String stringwt = String.valueOf(floatweight);

		System.out.println(stringwt);

	}
}

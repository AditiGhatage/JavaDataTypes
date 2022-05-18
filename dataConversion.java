package com.datatypecasting;

public class dataConversion {
	// String to int conversion
	public void verifyCandidateEligibility(String StrAge) {
		int Age = 18;
		int intConvertedAge = Integer.parseInt(StrAge);

		if (intConvertedAge > Age) {
			System.out.println("Candidate is eligible.");
		} else {
			System.out.println("Candidate is not eligible.");
		}
	}
}

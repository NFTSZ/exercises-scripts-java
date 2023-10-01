package com.aprenderjava;

public class Arrays {

	public static void main(String[] args) {
		// arrays = use to store multiple values in a single variable
		
		String[] cars = new String[3];
		
		cars[0] = "BMW";
		cars[1] = "Ferrari";
		cars[2] = "Supra";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}

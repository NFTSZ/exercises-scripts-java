package com.aprenderjava;

public class Arrays2d {

	public static void main(String[] args) {
		// 2D array = an array of arrays
		
		// This method
	//	String[][] cars = new String[3][3];
	//	cars[0][0] = "Camaro";
	//	cars[0][1] = "Lamborghini";
	//	cars[0][2] = "Subaru";
	//	cars[1][0] = "Ferrari";
	//	cars[1][1] = "Supra";
	//	cars[1][2] = "GT2R";
	//	cars[2][0] = "Porsche";
	//	cars[2][1] = "Mustang";
	//	cars[2][2] = "Audi";
		
		// or this method
		
		String[][] cars = { {"Camaro", "Lamborghini", "Subaru"},
							{"Ferrari", "Supra", "GT2R"},
							{"Porsche", "Mustang", "Audi"}
						};
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" "); // "" is the space between the cars
			}
		}
	}

}

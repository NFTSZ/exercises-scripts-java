package com.aprenderjava;

public class ExpressionsJava {
	public static void main(String args[]) {
		// expression =  operands & operators
		// operands =  values, variables, numbers, quantity
		// operator = + - * / %
		
		int friends = 10;
		friends++;  // that's same of friends = friends + 1;
		
		System.out.println(friends);
		
		double candy = 10;
		candy = (double) candy / 3; // return a no truncated number
		// candy / 3 return a int number truncated = 3
		
		System.out.println(candy);
	}
}
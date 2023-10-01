package com.aprenderjava;

public class LogicalOperators {
	public static void main(String[] args) {
		// logical operators = use to connect two or more expressions
		//		&& = AND both conditions must to be true
		//		|| = OR	either condition must to be true
		//		! = NOT reverses boolean values of condition
		
		int temp = 25;
		
		if (temp>30) {
			System.out.println("It is so hot outside!");
		}
		else if (temp>=20 && temp<=30) {
			System.out.println("It is so warm outside!");
		}
		else {
			System.out.println("It is so cold outside!");
		}
		
	}
}

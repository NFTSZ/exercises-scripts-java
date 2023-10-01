package com.aprenderjava;

import java.util.Scanner;

public class LogicalOperators2 {

	public static void main(String[] args) {
		// logical operators = use to connect two or more expressions
		//		&& = AND both conditions must to be true
		//		|| = OR	either condition must to be true
		//		! = NOT reverses boolean values of condition
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = sc.next();
		
		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game *pew pew*");
		}
		
		sc.close();
	}

}

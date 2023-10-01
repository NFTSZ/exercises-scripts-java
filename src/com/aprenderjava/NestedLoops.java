package com.aprenderjava;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		// nested loops = a loop inside a loop
		
		Scanner sc = new Scanner(System.in);
		int rows, columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = sc.nextInt();
		System.out.println("Enter # of columns: ");
		columns = sc.nextInt();
		System.out.println("Enter # of rows: ");
		symbol = sc.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=columns; j++) {
				System.out.print(symbol);	
			}
		}
		sc.close();
	}
}

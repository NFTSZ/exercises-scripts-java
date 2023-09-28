package com.aprenderjava;

public class SwapVariables {
	public static void main(String[] args) {
		String x = "Lemon juice";
		String y = "water";
		String temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}
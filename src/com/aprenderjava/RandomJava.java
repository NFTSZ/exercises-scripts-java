package com.aprenderjava;
import java.util.Random;

public class RandomJava {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int x = rd.nextInt(10)+1; // limited to 10 below
		double y = rd.nextDouble(9);
		boolean z = rd.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

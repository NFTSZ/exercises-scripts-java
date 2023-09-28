package com.aprenderjava;
import java.util.Scanner;

public class Hypotenuse {
	public static void main(String[] args) {
		double x, y, z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = sc.nextDouble();
		System.out.println("Enter side y: ");
		y = sc.nextDouble();
		
		z = Math.hypot(x, y); // in video has used: z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: " + z);
		
		sc.close();
	}
}

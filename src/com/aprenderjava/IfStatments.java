package com.aprenderjava;
import java.util.Scanner;

public class IfStatments {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("How old are you? ");
			int age = sc.nextInt();

			if(age<=10) {
				System.out.println("You are a kid");
			}
			else if(age > 10 && age < 18) {
				System.out.println("You are a teenager");
			}
			else if (age >= 18 && age <= 75) {
				System.out.println("You are an adult");
			}
			else {
				System.out.println("OK Boomer!");
			}
			
			sc.close();
		}

	}

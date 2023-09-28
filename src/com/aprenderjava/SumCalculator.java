package com.aprenderjava;
import javax.swing.JOptionPane;

public class SumCalculator {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Let's sum two numbers?");
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Insert a int number"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Insert a int number again"));
		int sum = num1 + num2;
		JOptionPane.showMessageDialog(null, "The sum of the two number is: " + sum);
	}

}
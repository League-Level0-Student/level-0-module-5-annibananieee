package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeNumbers {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("pick a number");
		int num = Integer.parseInt(answer);
		for (int i=2; i<num; i++) {	
		 	JOptionPane.showMessageDialog(null, "your number is prime");

		 	if (num%i==0) {
		 	JOptionPane.showMessageDialog(null, "your number isn't prime");
		 	}
	}
	}
		
		
		
		/*
		 *
		 * 5%2 == 3
		 * 5%3 == 2
		 * 5%4 == 1
		 * 
		 *
		 * 6%2 == 0
		 * 6%3 == 0
		 * 6%4 == 2
		 * 6%5 == 1
		 *
		 */
		 
	}


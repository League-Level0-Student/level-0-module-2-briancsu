//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		for (int i = 0; i < 10; i ++) {
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		
		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 0) {
			System.out.println("hi");
		}
		else if (randomNumber == 1) {
			System.out.println("hallo");
		}
		else if (randomNumber == 2) {
			System.out.println("helo");
		}
		else if (randomNumber == 3) {
			System.out.println("you are cool");
		}
		else {
			System.out.println("you are smart");
		}		
		
		
		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
}
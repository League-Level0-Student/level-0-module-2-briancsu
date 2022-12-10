package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;


public class lottery_numbers {
	public static void main(String[] args) {
		
		
		Random ran = new Random();
		int n1 = ran.nextInt(100-1 +1)+1;
		int n2 = ran.nextInt(100-1 +1)+1;
		int n3 = ran.nextInt(100-1 +1)+1;
		int n4 = ran.nextInt(100-1 +1)+1;
		int n5 = ran.nextInt(100-1 +1)+1;
		int n6 = ran.nextInt(100-1 +1)+1;

		JOptionPane.showMessageDialog(null, n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);

	}
	


}
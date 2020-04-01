package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(59)+1;
		int b = ran.nextInt(59)+1;
		int c = ran.nextInt(59)+1;
		int d = ran.nextInt(59)+1;
		int e = ran.nextInt(59)+1;
		
		JOptionPane.showMessageDialog(null, a+" "+b+" "+c+" "+d+" "+e);
		
	}
}

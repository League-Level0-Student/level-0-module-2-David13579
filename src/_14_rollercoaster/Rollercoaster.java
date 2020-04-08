package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you in Inches?");
		int tall = Integer.parseInt(height);
		if (tall>=48) {
			JOptionPane.showMessageDialog(null, "You can ride the coaster alone.");
		}
		else if (tall >=42 && tall<48) {
			JOptionPane.showMessageDialog(null,"You need to ride with someone else.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You need to grow more.");
		}
	}
}

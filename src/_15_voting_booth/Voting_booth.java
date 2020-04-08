package _15_voting_booth;

import javax.swing.JOptionPane;

public class Voting_booth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int years = Integer.parseInt(age);
		if (years >= 18) {
			String President = JOptionPane.showInputDialog("Who do you think the next president should be?");
		}
		else {
			JOptionPane.showMessageDialog(null,"No one cares about what you think.");
		}
	}
}

package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		String j = JOptionPane.showInputDialog("What is your birth year?");
		int l = Integer.parseInt(j);
		JOptionPane.showMessageDialog(null, "Check the System Output");
		for (int i = l; i < 2019; i++) {
			System.out.println("In " + i + " I was " + (i - l) + " year(s) old.");
		}

	}
}

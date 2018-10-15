package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String bday=JOptionPane.showInputDialog("When is your birthday?(mm/dd)");
		if(bday.equals("10/15")) {
			JOptionPane.showMessageDialog(null, "Happy Bday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy UNBday! HAHAHALOLOLOL!");
		}
	}
}

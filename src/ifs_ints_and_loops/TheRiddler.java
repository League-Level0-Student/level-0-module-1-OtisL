package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String oof1 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner (no caps)?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(oof1.equals ("a stamp")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONG. ANSWER: a stamp");
		}
		JOptionPane.showMessageDialog(null, "Score: "+score);
		String oof2 = JOptionPane.showInputDialog("What has hands but can't clap (no caps)?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(oof2.equals ("a clock")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONG. ANSWER: a clock");
		}
		JOptionPane.showMessageDialog(null, "Score: "+score);
	}
}


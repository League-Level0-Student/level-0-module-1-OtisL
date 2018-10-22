package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	public static void main(String[] args) {
		String password = "oof";
		String message = JOptionPane.showInputDialog("What is a secret message?");
		JOptionPane.showMessageDialog(null, "Switch people");
		String answer = JOptionPane.showInputDialog("You must guess the passcode to access the secret message");
		if (answer.equals(password)) {
			JOptionPane.showMessageDialog(null, "You got it right. The message was: \n"+message);
		}
		else {
			JOptionPane.showMessageDialog(null, "WRONG. SYSTEM LOCKOUT \n  SYSTEM LOCKOUT \n  SYSTEM LOCKOUT \n  SYSTEM LOCKOUT \n  SYSTEM LOCKOUT \n  SYSTEM LOCKOUT \n  SYSTEM LOCKOUT \n  SYSTEM LOCKOUT \n  SYSTEM LOCKOUT \n");
		}
	}
}

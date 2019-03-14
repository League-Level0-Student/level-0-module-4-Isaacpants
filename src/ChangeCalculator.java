
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		String p = JOptionPane.showInputDialog("how many pennies do u have");
		int p1 = Integer.parseInt(p);

		// Ask the user how many nickels they have
		String n = JOptionPane.showInputDialog("how many nickls do u have");
		// Convert their answer to an int using Integer.parseInt
		int n1 = Integer.parseInt(n);
		// Ask the user how many dimes they have, and convert their answer
		String d = JOptionPane.showInputDialog("how many dimes do u have");
		int d1 = Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
		String q = JOptionPane.showInputDialog("how many quarters do u have");
		int q1 = Integer.parseInt(q);
		// Calculate how much money the user has and save it in a double variable
		p1 = p1 * 1;
		n1 = n1 * 5;
		d1 = d1 * 10;
		q1 = q1 * 25;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have"+p1+n1+d1+q1);
	}
}

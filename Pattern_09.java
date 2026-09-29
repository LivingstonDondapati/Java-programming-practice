package com.codegnan.Patterns;

public class Pattern_09 {

	public static void main(String[] args) {

		int rows = 5, columns = 5;

		for (int i = 0; i < rows; i++) {

			// spaces
			for (int j = 0; j < rows - i - 1; j++) {
				System.out.print("  ");
			}

			// stars
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

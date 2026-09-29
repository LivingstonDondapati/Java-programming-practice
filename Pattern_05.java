package com.codegnan.Patterns;

public class Pattern_05 {

	public static void main(String[] args) {

		int rows = 5, columns = 5;
		// outer for loop (rows)
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print( (6-j) + " ");
			}
			System.out.println();
		}
	}
}

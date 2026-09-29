package com.codegnan.Patterns;

public class Pattern_04 {

	public static void main(String[] args) {

		int rows = 5, columns = 5;
		//outer for loop(rows)
		for (int i = 1; i <= rows; i++) {
		//Inner for loop(columns)
			for (int j = 1; j <= columns; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

package com.codegnan.Patterns;

public class Pattern_01 {

	public static void main(String[] args) {

		int rows = 5, columns = 5;
		//outer for loop(rows)
		for (int i = 1; i <= rows; i++) {//replaced 0 with 1 & "<" with "<=" for numbers output instead of *
		//Inner for loop(columns)
			for (int j = 1; j <= columns; j++) {
//				System.out.print("* ");//Prints * 
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

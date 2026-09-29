package com.codegnan.Patterns;

public class Pattern_01 {

	public static void main(String[] args) {

		int rows = 5, columns = 5;
		//outer for loop(rows)
		for (int i = 0; i < rows; i++) {
		//Inner for loop(columns)
			for (int j = 0; j < columns; j++) {
//				System.out.print("* ");//Prints * 
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

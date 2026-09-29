package com.codegnan.Patterns;

public class DiamondPattern {

	public static void main(String[] args) {
		//Upper Part of the Diamond(full Pyramid)
		int rows = 5;
		for (int i = 1; i <= rows; i++) {//outer for-loop (rows)
			for (int j = 1; j <= rows - i; j++) {
				//inner - loop 1: prints leading spaces
				System.out.print("  ");
				
			}
			//inner loop 2
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(" *");
			}
			System.out.println();//new line for each row
			
		}
	//Lower part of the Diamond (Inverted Full Pyramid)
		for (int i = rows - 1; i >= 1; i--) {//outer for-loop for rows in downward
			//inner for loop 1: printing spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(" *");
			}
			System.out.println();
			
		}
	}

}

package com.codegnan.Patterns;

public class DiamondPattern {

	public static void main(String[] args) {
		// Upper Part of the Diamond(full Pyramid)
		int rows = 5;
		for (int i = 1; i <= rows; i++) {// outer for-loop (rows)
			for (int j = 1; j <= rows - i; j++) {
				// inner - loop 1: prints leading spaces
				System.out.print("  ");

			}
			// inner loop 2
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(" *");
			}
			System.out.println();// new line for each row

		}
		// lower part of the diamond(inverted full pyramid)
		for (int i = rows - 1; i >= 1; i--) {// i=4;4>=1// outer for loop for row
			// inner for loop 1. printing spaces.
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
//Pattern	Spaces	Stars/positions
//Square	—	columns
//Pyramid	rows - i	2*i - 1
//Inverted pyramid	i - 1	2*(rows-i)+1
//Diamond	rows-i / i-1	2*i-1
//Hollow square	—	boundary condition
//Hollow pyramid	rows-i	2*i-1 + boundary condition
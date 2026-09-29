package com.codegnan.Patterns;

public class ButterflyPattern {

	public static void main(String[] args) {

		int rows = 5;
		// upper part of the butterfly pattern(expanding wings)
		for (int i = 1; i <= rows; i++) {// outer for-loop (controls the current roll number)
			// inner for-loop 1: print the star as left wing
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// Inner for-loop 2: Print spaces in middle gap
			// The number spaces decrease as i increases
			// FORMULA - 2 * (rows - i)
			int spaces = 2 * (rows - i);
			for (int k = 1; k <= spaces; k++) {
				System.out.print(" ");
			}
			// Inner for-loop 3: print the star as right wing
			for (int a = 1; a <= i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
			//lower part of the butterfly pattern
			for (int i = rows - 1; i >= 1; i--) {//outer for-loop for the pattern below
				//inner for-loop 1: for the pattern below
				//printing the stars on left wing, the number of stars decreases with i
				for (int j = 1; j<= i; j++) {
					System.out.print("*"); 
				}
				//inner loop 2: print spaces
				int spaces = 2 * (rows - i);
				for (int k = 1; k <= spaces; k++) {
					System.out.print(" ");
				}
			//Inner for-loop 3: printing stars on 
				for (int a = 1; a <= i; a++) {
					System.out.print("*");
					
				}
				System.out.println();
			}
	}

}

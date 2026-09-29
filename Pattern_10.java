package com.codegnan.Patterns;

public class Pattern_10 {

	public static void main(String[] args) {
		
		int rows = 5;

		// Outer for-loop for rows
		for (int i = 1; i <= rows; i++) {

		    // Inner for-loop 1: print leading spaces
		    for (int j = 1; j <= rows - i; j++) {
		        System.out.print(" ");
		    }

		    // Inner for-loop 2: print stars
		    for (int j = 1; j <= 2 * i - 1; j++) {

		        // print star on left, right and bottom
		        if (j == 1 || j == 2 * i - 1 || i == rows) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }

		    System.out.println();
		}

	}

}

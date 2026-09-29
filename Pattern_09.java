package com.codegnan.Patterns;

public class Pattern_09 {

	public static void main(String[] srgs) {

		int rows = 5;

		// Upper part of the diamond
		for (int i = 1; i <= rows; i++) {

			// inner for-loop 1: print leading spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// inner for-loop 2: print stars
			for (int j = 1; j <= 2 * i - 1; j++) {

				// print stars only on boundary
				if (j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		
		// Lower part of the diamond
		for (int i = rows - 1; i >= 1; i--) {

		    // inner for-loop 1: print leading spaces
		    for (int j = 1; j <= rows - i; j++) {
		        System.out.print(" ");
		    }

		    // inner for-loop 2: print stars
		    for (int j = 1; j <= 2 * i - 1; j++) {

		        // print stars only on boundary
		        if (j == 1 || j == 2 * i - 1) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }

		    System.out.println();
		}
	}
}

package Assignments;

public class Assisted_project9 {
	public static void main(String[] args) {

		// single-dimensional array
		int a[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < 5; i++) {
			System.out.println("Elements of array a: " + a[i]);
		}

		// multidimensional array
		int[][] b = { { 2, 4, 6, 8 }, { 3, 6, 9, 12 } };
		System.out.println("\nLength of row 1: " + b[0].length);
		/*
		 * for (int i = 0; i < 4; i++) { for (int j = 0; j < 4; j++)
		 * System.out.println("Elements of array b: " + b[i][j]);
		 */
	}
}

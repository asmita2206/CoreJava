

public class TwoDimentionalArrayDemo {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int b[] = { 2, 3, 4, 5 };
		int c[] = { 6, 7, 8, 9 };

		int d[][] = { a, b, c };

		int f[][] = {
				{ 9, 8, 7, 7 },  // no.of columns are not fixed that is jagged arrays
				{ 3, 4, 6 },
				{ 4, 7, 1, 3 }
		};
		for (int i = 0; i < 3; i++) { // row
			for (int j = 0; j < 4; j++) // column
			{
				System.out.print(" " + d[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < f[i].length; j++) {
				System.out.print(" " + f[i][j]);
			}
			System.out.println();
		}
	}
}

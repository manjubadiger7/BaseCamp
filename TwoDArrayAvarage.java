import java.util.Scanner;

public class TwoDArrayAvarage {
	static Scanner sc = new Scanner(System.in);

	private static int[][] inputElement(int number) {
		int[][] twoDArray = new int[number][number];
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.println("Enter element");
				twoDArray[i][j] = sc.nextInt();
			}
		}
		return twoDArray;

	}

	private static void diplay(int[][] twoDArray) {
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray.length; j++) {
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void avrage(int[][] twoDArray, int number) {
		int firstDigonal = 0, secondDigonal = 0, fDcount = 0, sDcount = 0;

		for (int i = 0; i < twoDArray.length; i++) {
			int prymaryDigonalElement = 0;
			int secondaryDigonalElemnt = 0;
			for (int j = 0; j < twoDArray.length; j++) {
				if (i == j && twoDArray[i][j] % 2 != 0) {
					prymaryDigonalElement = twoDArray[i][j];
					firstDigonal += twoDArray[i][j];
					fDcount++;
				}

				if ((i + j) == (number - 1) && twoDArray[i][j] % 2 != 0) {
					secondaryDigonalElemnt = twoDArray[i][j];
					secondDigonal += twoDArray[i][j];
					sDcount++;
				}

				int temp = prymaryDigonalElement;
				prymaryDigonalElement = secondaryDigonalElemnt;
				secondaryDigonalElemnt = temp;
				

			}
		}
		System.out.println("Primary diagonal odd numbers average: " + firstDigonal / fDcount);
		System.out.println("Secondary diagonal idd number average: " + secondDigonal / sDcount);
	}

	public static void main(String[] args) {

		System.out.println("Enter number of rows and columns");
		int number = sc.nextInt();

		int[][] twoDArray = inputElement(number);
		diplay(twoDArray);

		avrage(twoDArray, number);

	}
}

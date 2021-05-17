import java.util.Scanner;

public class TwoDArray {
	static int twoDArray[][];
	static Scanner sc = new Scanner(System.in);

//--------------------------Inserting array elements--------------------------------------------
	public void inputArray(int row, int col) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				twoDArray[i][j] = checkforUnique(twoDArray);
			}
		}
		System.out.println("Before swaping");
		printTwoDArray(twoDArray, row, col);
		swaping(twoDArray, row, col);
	}

//------------------------Checking for uniqunes-------------------------------------------------
	private int checkforUnique(int[][] twoDArray2) {
		System.out.println("Enter element to insert into array");
		int inputEle = sc.nextInt();

		for (int k = 0; k < twoDArray2.length; k++) {
			for (int k2 = 0; k2 < twoDArray2.length; k2++) {
				if (twoDArray[k][k2] == inputEle) {
					System.out.println("this element is already exist please enter again");
					checkforUnique(twoDArray2);
				}

			}

		}
		return inputEle;
	}

// ------------------------------Printing Array---------------------------------------------------
	void printTwoDArray(int array[][], int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

//------------------------------Swaping Array element-----------------------------------------------
	void swaping(int array[][], int row, int col) {

		int minimumValue = array[0][0];
		int maximumValue = array[0][0];
		int miniRow = 0;
		int maxRow = 0;
		int miniCol = 0;
		int maxCol = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (array[i][j] < minimumValue) {
					minimumValue = array[i][j];
					miniRow = i;
					miniCol = j;
				}
				if (array[i][j] > maximumValue) {
					maximumValue = array[i][j];
					maxRow = i;
					maxCol = j;
				}
			}
		}
		// swaping minimumm value and maximum value
		array[miniRow][miniCol] = array[miniRow][miniCol] + array[maxRow][maxCol];
		array[maxRow][maxCol] = array[miniRow][miniCol] - array[maxRow][maxCol];
		array[miniRow][miniCol] = array[miniRow][miniCol] - array[maxRow][maxCol];
		System.out.println("After swaping");
		printTwoDArray(twoDArray, row, col);
	}

//----------------------------Driver method---------------------------------------------------------
	public static void main(String[] args) {
		System.out.println("Please enter number of rows");
		int row = sc.nextInt();
		System.out.println("Please enter number of columns");
		int col = sc.nextInt();
		twoDArray = new int[row][col];
		TwoDArray obj = new TwoDArray();
		obj.inputArray(row, col);
	}
}

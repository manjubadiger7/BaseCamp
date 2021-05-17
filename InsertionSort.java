import java.util.Scanner;

public class InsertionSort {
	static int inputArray[];
	static Scanner sc = new Scanner(System.in);

	public void sort(int array[], int size) {
		for (int i = 1; i < size; ++i) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	void printArray(int array[], int size) {
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Please enter number of elements.");
		int size = sc.nextInt();
		inputArray = new int[size];
		for (int i = 0; i < size; ++i) {
			System.out.println("Enter " + i + "th Element");
			inputArray[i] = sc.nextInt();
		}
		InsertionSort obj = new InsertionSort();
		obj.sort(inputArray, size);
		System.out.println("Sorted Array using Insertion sort is");
		obj.printArray(inputArray, size);
	}
}
import java.util.Scanner;

public class BinarySearch {
	static String fruits[];
	static Scanner sc = new Scanner(System.in);

	static void userInput(int numberOfFruits) {
		for (int i = 0; i < numberOfFruits; i++) {
			System.out.println("Please enter " + (i + 1) + " fruit name");
			fruits[i] = sc.nextLine();
		}
		System.out.println("You have entered fruits successfully.");
	}

	public static int searchForFruit(String[] fruit, String key) {
		int left = 0;
		int right = fruit.length - 1;
		while (left <= right) {
			int middle = left + (right - left) / 2;

			int res = key.compareTo(fruit[middle]);
			if (key == (fruit[middle]))

				res = 0;

			if (res == 0)
				return middle;
			if (res > 0)
				left = middle + 1;
			else
				right = middle - 1;
		}
		return -1;
	}

	public static String[] sortArray(String[] fruits) {
		String temp;

		// Sorting strings using bubble sort
		for (int j = 0; j < fruits.length - 1; j++) {
			for (int i = j + 1; i < fruits.length; i++) {
				if (fruits[j].compareTo(fruits[i]) > 0) {
					temp = fruits[j];
					fruits[j] = fruits[i];
					fruits[i] = temp;
				}
			}
		}
		return fruits;
	}

	private static void displayFruits(String[] fruits) {
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Please enter number of fruits");
		int numberOfFruits = sc.nextInt();
		fruits = new String[numberOfFruits];
		sc.nextLine();
		userInput(numberOfFruits);

		fruits = sortArray(fruits);
		displayFruits(fruits);
		System.out.println("Please enter fruit name to search.");
		String key = sc.nextLine();
		int result = searchForFruit(fruits, key);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}
}

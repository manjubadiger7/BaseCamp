
public class NewSubArray {
	public static void main(String[] args) {
		int array[] = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
		int[] outputArray = new int[6];
		int min = array[0], max = array[0];

		int index = 0;
		for (int i = 3; i <= 8; i++) {
			outputArray[index] = array[i];
			index += 1;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Minimum element in the array is: " + min);
		System.out.println("Maximum element in the array is: " + max);
		System.out.println("Sub array is");
		for (int i = 0; i < outputArray.length; i++) {
			System.out.print(outputArray[i]+" ");
		}

	}
}

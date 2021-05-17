import java.util.Scanner;

public class Strings {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter tring");
		String sentence = sc.nextLine();

		String word = "";
		String[] words = new String[100];

		sentence = sentence + " ";

		

		for (int i = 0; i < sentence.length(); i++) {

			if (sentence.charAt(i) != ' ') {
				word = word + sentence.charAt(i);
			} else {
				// Add word to array words
				words[length] = word;
				// Increment length
				length++;
				// Make word an empty string
				word = "";

			}
		}
		for (int i = 0; i < length; i++) {
			String evenword = "";
			if (i % 2 == 0) {
				for (int j = 0; j < words[i].length(); j++) {
					char ch = words[i].charAt(j);
					ch = (char) (ch + 1);
					evenword = evenword + ch;
				}
				System.out.println(evenword);
				System.out.print(" ");
			} else {
				String oddword = "";
				for (int j = (words[i].length()) - 1; j >= 0; j--) {

					char ch = words[i].charAt(j);
					ch = (char) (ch - 32);
					oddword += ch;
				}
				System.out.println(oddword);
				System.out.print(" ");
			}

		}
	}
}

//Orchard is best place

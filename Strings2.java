//asking string1
//asking string2
//concating two strings with one space
//traversing trough the string and searching for characters
//assigning each character to variable
//printing output

//-----------------
//sample input

//word1 = ja123va12
//word2 = pr1ogr244m76mi55n6g
//output = java programming
//--------------------------



import java.util.Scanner;

public class Strings2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter first string");
		String string1 = sc.nextLine();
		System.out.println("Enter second string");
		String string2 = sc.nextLine();

		string1 += " " + string2;
		String output = "";
		for (int i = 0; i < string1.length(); i++) {

			if (string1.charAt(i) != ' ') {
				if (string1.charAt(i) >= 'A' && string1.charAt(i) <= 'z') {
					output += string1.charAt(i);
				} else {
					continue;
				}
			} else {
				output += ' ';
			}
		}
		System.out.println(output);
	}
}
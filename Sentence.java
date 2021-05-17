import java.util.Scanner;

public class Sentence {

	static String sentence;

	static Scanner sc = new Scanner(System.in);

	static void findAndreplace(String sentence) {
		String lowerCaseSentence = sentence.toLowerCase();
		
		int flag = 0;

		for (int i = 0; i < lowerCaseSentence.length(); i++) {
			char ch = lowerCaseSentence.charAt(i);
			
			if (ch == ' ') {
				System.out.print(" ");
				continue;
			} 
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = 1;
				System.out.print(ch);
				continue;
			} 
			if(flag == 1) {
				ch = (char)(ch + 1);
				System.out.print(ch);
				flag = 0;
			}
			else {
				System.out.print(ch);
			}
		}
	}


	public static void main(String[] args) {

		System.out.println("Please enter a String");
		sentence = sc.nextLine();
		findAndreplace(sentence);
	}
}
//
//
//MANJUNATH SURESH BADIGER
//12 hours ago
//
//i completed my1st capabilities
//


import java.util.*;

//Question 4
//main method breaks out of loop via label when character is found
public class Question4_Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = new String[5];
		char target;
		
		System.out.println("Please enter five words to search");
		words[0] = scanner.next();
		words[1] = scanner.next();
		words[2] = scanner.next();
		words[3] = scanner.next();
		words[4] = scanner.next();
		System.out.println("What character would you like to search?");
		target = scanner.next().charAt(0);
		
		System.out.println("\nWords:");
		for(int i = 0; i < words.length; ++i) {
			System.out.println((i + 1) + ". " + words[i]);
		}
		System.out.println("Character: " + target);
		
		SEARCH_CHAR:
			for(int i = 0; i < words.length; ++i) {
				for(int j = 0; j < words[i].length(); ++j) {
					if(words[i].charAt(j) == target) {
						System.out.println("Char has been found and loop ended via label");
						break SEARCH_CHAR;
					}
				}
			}
	}
}
		
import java.util.*;

//Question 3
//main method checks if a word entered by the user is a palindrome
//via recursive method check
public class Question3_Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word, ans;
		
		do {
			System.out.println("Please enter the word to get a palindrome check");
			word = scanner.next();
			
			if(check(word)) {
				System.out.println('\n' + word + " is a palindrome");
			}
			else {
				System.out.println('\n' + word + " is not a palindrome");
			}
			
			System.out.println("\nWould you like to try again? Y/N");
			ans = scanner.next();
		} while(ans.equals("Y") || ans.equals("y"));
		
		System.out.println("END OF PROGRAM");
	}
	
	//One String element s
	//Checks to see if s is a palindrome
	//Returns whether it is true or false
	public static boolean check(String s) {
		if(s.length() <= 1) {
			return true;
		}
		
		return (s.charAt(0) == s.charAt(s.length() - 1) ? 
			check(s.substring(1, s.length() - 1)) : false);
	}
}
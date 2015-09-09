import java.util.*;

//Question 1
//main method creates a pyramid with a size specified by user
//Numbers increase on the left, and decrease on the right
public class Question1_Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size, width;
		String line, spaces, ans;
		
		do {
			System.out.println("Please enter in the size of pyramid desired:");
			size = scanner.nextInt();
			width = size + (size - 1) + (size - 1) * 2;
			
			//To adjust the width for double digit numbers
			if(size >= 10) {
				width = width + (size - 9) + (size - 10);
			}
			
			//To make the width a variable in printf instead of a constant value
			String format = "%" + Integer.toString(width) + "s\n";
			
			//Used to add spacing on the end of a string in order to center
			spaces = "";
			for(int i = 0; i < width / 2; ++i) {
				spaces = spaces + " ";
			}
			
			for(int i = 1; i <= size; ++i) {
				line = buildLeft(i) + Integer.toString(i) + buildRight(i);
				System.out.printf(format, 
					(line + spaces.substring((line.length() - 1) / 2)));
			}
			
			System.out.println("\nDo you wish to try again? Y/N");
			ans = scanner.next();
		} while(ans.equals("Y") || ans.equals("y"));
		
		System.out.println("\nEND OF PROGRAM");
	}
	
	//One parameter - int i
	//Adds to the left of the center number
	//Returns the left side of the center number
	public static String buildLeft(int i) {
		if(i == 1) {
			return "";
		}
		
		return buildLeft(i - 1) + Integer.toString(i - 1) + " ";
	}
	
	//One parameter - int i
	//Adds to the right of the center number
	//Returns the right side of the center number
	public static String buildRight(int i) {
		if(i == 1) {
			return "";
		}
		
		return " " + Integer.toString(i - 1) + buildRight(i - 1);
	}
}
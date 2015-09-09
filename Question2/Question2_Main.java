import java.util.*;

//Question 2
//main method will make a calender based on user input
public class Question2_Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] months = new String[12];
		String firstDay;
		String spacing = "                     ";
		String ans;
		int[] days = new int[12];
		int year;
		int dayOfWeek = 1;
		
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		days[0] = 31;
		days[2] = 31;
		days[3] = 30;
		days[4] = 31;
		days[5] = 30;
		days[6] = 31;
		days[7] = 31;
		days[8] = 30;
		days[9] = 31;
		days[10] = 30;
		days[11] = 31;	
		
		do {
			System.out.println("What year would you like to see?");
			year = scanner.nextInt();
			System.out.println("What day was the first of January?");
			firstDay = scanner.next();
			
			if(year % 4 == 0) {
				days[1] = 29;
			}
			else {
				days[1] = 28;
			}
			
			if(firstDay.equals("sunday")) {
				dayOfWeek = 1;
			}
			else if(firstDay.equals("monday")) {
				dayOfWeek = 2;
			}
			else if(firstDay.equals("tuesday")) {
				dayOfWeek = 3;
			}
			else if(firstDay.equals("wednesday")) {
				dayOfWeek = 4;
			}
			else if(firstDay.equals("thursday")) {
				dayOfWeek = 5;
			}
			else if(firstDay.equals("friday")) {
				dayOfWeek = 6;
			}
			else if(firstDay.equals("saturday")) {
				dayOfWeek = 7;
			}
			
			for(int m = 0; m < months.length; ++m) {
				System.out.println("\n\n     " + months[m] + " " + year);
				System.out.println(" Su Mo Tu We Th Fr Sa");
				System.out.print(spacing.substring(0, (dayOfWeek - 1) * 3));
				for(int d = 0; d < days[m]; ++d) {
					System.out.printf("%3s", Integer.toString(d + 1));
					
					if(dayOfWeek == 7) {
						System.out.print('\n');
					}
					
					dayOfWeek = (dayOfWeek % 7) + 1;
				}
			}
			
			System.out.println("\n\nWould you like to try again? Y/N");
			ans = scanner.next();
		} while(ans.equals("Y") || ans.equals("y"));
		System.out.println("END OF PROGRAM");
	}
}
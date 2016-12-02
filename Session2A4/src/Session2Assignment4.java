import java.util.Scanner;

public class Session2Assignment4 {
	
	/*
	 * Write a program to print total number of days in the given month.
	 */
	
	public static void main(String[] args) {
		
		int selection = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many days in a month?");
		System.out.println("Enter month number.");
		
		//while (selection < 1 && selection > 13) 
		selection = scan.nextInt();
		
		switch(selection){
		case 1: System.out.print("January " + 31);break;
		case 2: System.out.print("February " + 28); break;
		case 3: System.out.print("March " + 31); break;
		case 4: System.out.print("April " + 30); break;
		case 5: System.out.print("May " + 31); break;
		case 6: System.out.print("June " + 30); break;
		case 7: System.out.print("July " + 31); break;
		case 8: System.out.print("August " + 31); break;
		case 9: System.out.print("September " + 30); break;
		case 10: System.out.print("October " + 31); break;
		case 11: System.out.print("November " + 30); break;
		case 12: System.out.print("December " + 31); break;
		}
		
System.out.println(" Days");
	}

}

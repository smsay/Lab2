package Lab2;

import java.util.Scanner;

public class Question2_Cookies {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		    System.out.print("Number of eaten cookies: ");
		 
		    int eatenCookie = scan.nextInt();
		 
		    int servingSize = 40/10;
		    int calPerCookie = 300/servingSize;
		    int totalCal = eatenCookie * calPerCookie;
		 
		    System.out.println("Total calories consumed: " + totalCal);
	}

}

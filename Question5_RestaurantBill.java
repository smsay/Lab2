package Lab2;

import java.util.Scanner;

public class Question5_RestaurantBill {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Charge of the meal: ");
		double charge=sc.nextInt();
		double tax=(charge*6.75)/100;
		double tip=((charge+tax)*20)/100;
		System.out.println("Meal Charge: " + charge);
		System.out.println("Tax amount: " + tax);
		System.out.println("Tip amount: " + tip);
		System.out.println("Total Bill: " + (charge+tax+tip));
		
		

	}

}

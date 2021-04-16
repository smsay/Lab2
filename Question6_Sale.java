package Lab2;

import java.util.Scanner;

public class Question6_Sale {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount of purchase: ");
		 double amount= sc.nextDouble();
		 double stateSalesTax=0.04*amount;
		 double countySalesTax=0.02*amount;
		 double totalSalesTax=stateSalesTax+countySalesTax;
		 double totalSale=totalSalesTax+amount;

		 System.out.println( " Purchase " + amount);
		 System.out.println( " State Tax " + stateSalesTax);
		 System.out.println( " County Tax " + countySalesTax );
		 System.out.println( " Total Sales Tax " + totalSalesTax);
		 System.out.println( " Total Sale " + totalSale);

		 }

	}



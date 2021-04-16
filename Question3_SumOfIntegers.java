package Lab2;

import java.util.Scanner;

public class Question3_SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		 int num = sc.nextInt();
		 int sum=0;
		 
		 for(int i=1;i<=num;i++) {
			 sum=sum+i;
		 }
		 System.out.println("sum of all the integers from 1 up to the "+num+" entered is: "+sum );
	}

}

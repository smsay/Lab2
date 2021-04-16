package Lab2;

import java.util.Scanner;

public class Question1_SeiesOfNumbers {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your first number: " );
		int num=sc.nextInt();
		int min=num;
		int yes=1;
		while(yes==1) {
			System.out.println("Enter the next number: ");
			int nextNum=sc.nextInt();
			if(num>nextNum) {
				if(nextNum<=min) {
					min=nextNum;
				}
			}else {
				num=nextNum;
			}System.out.println("Do you want to enter another number: 0-No,1-Yes");
			yes=sc.nextInt();
		}
		System.out.println("Largest number is: "+num);
		System.out.println("Smallest number is: "+min);
			
			
		}
		
		
	}



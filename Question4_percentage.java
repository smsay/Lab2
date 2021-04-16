package Lab2;

import java.util.Scanner;

public class Question4_percentage {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of males: ");
		int males=sc.nextInt();
		System.out.println("Number of females: ");
		int females=sc.nextInt();
		int sum=males+females;
		double percentageMale=((double)males/sum)*100;
		double percentageFemale=((double)females/sum)*100;
		
		System.out.println("Percentage of males in the class: "+ percentageMale);
		System.out.println("Percentage of females in the class: "+ percentageFemale);

	}

}

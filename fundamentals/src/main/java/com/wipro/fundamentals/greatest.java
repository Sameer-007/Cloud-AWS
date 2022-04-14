package com.wipro.fundamentals;
import java.util.Scanner;
public class greatest {

	public static void main(String[] abc)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number2: ");
		int n2 = sc.nextInt();
		if(n1>n2) {
			System.out.println(n1+" is greater than "+n2);
		
		}
		else
			System.out.println(n2+" is greater than "+n1);
	}
}

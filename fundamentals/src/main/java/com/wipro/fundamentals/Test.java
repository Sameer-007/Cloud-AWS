package com.wipro.fundamentals;
import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		//3 types of variables instance,class/static,local
	    //local variable- declared inside a block
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if(n%2 == 0) {
			System.out.println("Even number");
		}
		else
			System.out.println("Odd number");
	}
}

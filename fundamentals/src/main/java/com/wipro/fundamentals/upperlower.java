package com.wipro.fundamentals;
import java.util.Scanner;
public class upperlower {

	public static void main(String[] args)
	{
		char A = 'A', a='a',Z = 'Z',z='z';
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		if(input>=A && input<=Z)
			System.out.println("Upper Case");
	
		else if(input>=a && input<=z)
			System.out.println("Lower Case");
		else
			System.out.print("not a Character");
	}
}

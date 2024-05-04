package javaBasics;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter the number");	
		int a = Sc.nextInt();
		if(a%2!=0)
		{
			System.out.println("Prime number");
		}
		else {
			System.out.println(" Not a prime number");
		}
	}

	}
   

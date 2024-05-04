package javaBasics;

import java.util.Scanner;


public class Fibannocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		int a=0,b=1,c;
		System.out.println(a+" "+b+" ");
		for(int i=2; i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}


	}
}


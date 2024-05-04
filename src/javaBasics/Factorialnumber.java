package javaBasics;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner Sc= new Scanner(System.in);
				System.out.println(" Enter the value");
				int a = Sc.nextInt();
				int i=a,fact=1;
				do
				{
					fact=fact*i;
					i--;
				}
				while(i>=1);
				System.out.println(fact);
			}


	}


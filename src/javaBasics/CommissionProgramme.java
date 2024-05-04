package javaBasics;

import java.util.Scanner;

public class CommissionProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter principle amount");
		double p= Sc.nextDouble();
		System.out.println("Enter time in months");
		int t=Sc.nextInt();
		double c=0;
		if(t>=12) {
			c=p*0.1;
		} 
		else if(t>=6&&t<12)
		{
			c=p*0.05;
		}
		else if(t<6&&p>50000)
		{
			c=200;
		}
		double tc=t*c;
	}


	}


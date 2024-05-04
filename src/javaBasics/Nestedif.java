package javaBasics;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int x= Sc.nextInt();
		if(x<=500) {
			System.out.println("welcome");
			if(x>=300) {
				System.out.println("Suresh");
			}
		}

	}

}

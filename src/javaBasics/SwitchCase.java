package javaBasics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				Scanner Sc = new Scanner(System.in);
				System.out.println("Enter day number to display day name :");
				int daynumber = Sc.nextInt();			
				switch (daynumber) {
				case 1: 
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
					
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					
				default:
					System.out.println("invalid input");
					break;
				}

			}

	

	}


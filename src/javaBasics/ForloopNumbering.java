package javaBasics;

public class ForloopNumbering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int rev=0;
		int rem=0;
		//int rem=n%10;
		for( n=1234;n>0;) {
			 rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
			}
			System.out.println(rev);
		}


	}

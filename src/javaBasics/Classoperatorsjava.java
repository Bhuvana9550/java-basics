package javaBasics;

public class Classoperatorsjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		int c = a + a++;
		System.out.println(c);
		System.out.println(a);
		
		c = a + a++ + b + b++ + a + b;
		System.out.println(c);


	}

}

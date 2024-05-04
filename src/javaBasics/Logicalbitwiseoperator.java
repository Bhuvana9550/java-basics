package javaBasics;

public class Logicalbitwiseoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50, b = 30;
		if(a<b&&++b>=30){
		System.out.println("welcome");
		System.out.println("Java classes");
		}
		else {
			System.out.println("Bye");
		}
		test1();
		test2();
		}
	public static void test1() {
		int a = 20, b = 30;
		if(a<b&++b>=30){
			System.out.println("Yes");
	}else {
		System.out.println("No");
	}
		
	}
	public static void test2() {
		int a = 20, b = 30;
		if(a>b||++b<=30){
			System.out.println("OK");
		}else {
			System.out.println("not ok");
		}

	}

}

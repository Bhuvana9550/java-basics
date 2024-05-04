package javaBasics;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10;i++) {
			for(int j=1; j<=5;j++) {
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		System.out.println("**********  ");
		test1();
		test2();
	}
	
	public static void test1() {
		for(int i=1; i<=10;i++){
			for(int j=1; j<=5;j++) {
				System.out.print(j+"\n");
			}
			System.out.println();
		}
		System.out.println("**************");
	}
	
	public static void test2() {
		for(int i=1; i<=10;i++){
			for(int j=1;j<=5;j++) {
				System.out.print(i+j+"\t");
				
			}
			System.out.println();
		}


	}

}

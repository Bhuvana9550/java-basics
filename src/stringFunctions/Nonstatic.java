package stringFunctions;

public class Nonstatic {
	 static int x;
	 static String str1;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		display();
		x=100;
		str1="yamini";
		System.out.println(x);
		System.out.println(str1);
		
	Nonstatic e1=new Nonstatic();
	e1.test();

	}
	public static void show() {
		System.out.println(x);
	}
	public static void display() {
		System.out.println(str1);
	}
	public void test() {
		System.out.println("");
	}


	}


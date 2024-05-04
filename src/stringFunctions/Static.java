package stringFunctions;

 

public class Static {
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

	}
	public static void show() {
		System.out.println(x);
	}
	public static void display() {
		System.out.println(str1);
	}

}

package stringFunctions;

public class Stringconcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Selenium";
		int size=str.length();
		System.out.println(size+" ");
		char c=str.charAt(3);
		System.out.println(c);
		 System.out.println(str.isEmpty());
	//	 System.out.println(str2.isEmpty());
		
		String str3="Java";
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		
		String str4=str.toUpperCase();
		System.out.println(str4);
		System.out.println(str.equals(str3));
		
		String str5="quality thought";
		String str6="QUALITY thought";
		System.out.println(str5.equalsIgnoreCase(str6));
		
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('e'));
		
		String str7="Rajeshwarikalyanam";
		System.out.println(str7.length());
		System.out.println(str7.indexOf('a'));
		System.out.println(str7.lastIndexOf('a'));
		System.out.println(str7.indexOf('a',0 ));
	}

}

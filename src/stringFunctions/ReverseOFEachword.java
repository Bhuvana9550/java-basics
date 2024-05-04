package stringFunctions;

public class ReverseOFEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="quality is";
		String []s=str.split(" ");
		System.out.println(s.length);
		for(int i=0;i<s.length;i++) {
			for(int j=s[i].length()-1;j>=0;j--) {  
				char c = str.charAt(j);
				System.out.print(c);
				
			}
		}

	}

}

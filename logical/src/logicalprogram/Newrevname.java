package logicalprogram;

public class Newrevname {
	public static void main(String[]args) {
		String A="Ashwini";
		int length =A.length();

	String Rev =""	;
		
		for (int i=length-1;i>=0;i--) {
		
		
		
		
		Rev=Rev+A.charAt(i);
		
		
		
		
		
		}	
		
		System.out.println(Rev);
		
		
		if (Rev.equalsIgnoreCase(A)) {
		
		System.out.println("palindron");
		
		}
		else {
		System.out.println("no palindron");
		
		
		}	
		}	
	}



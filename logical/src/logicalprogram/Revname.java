package logicalprogram;

public class Revname {

public static void main(String[]args) {	
	String A="aditi";
	String rev="";
	int length=A.length();
	
	for(int i=length-1;i>=0;i--) {
	
	rev=rev+A.charAt(i);
	System.out.println(rev);
	}
	if(rev.equalsIgnoreCase(A)) {
	System.out.println("palendron");	
		
	}
	
	else {
		System.out.println("no palendron");
	}
}

}

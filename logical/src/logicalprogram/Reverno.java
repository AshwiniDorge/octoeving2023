package logicalprogram;

public class Reverno {
public static void main (String[]args) {
	
	int n=432;
	int a=0;
	int b;
	while(n>0) {
	b=n%10;
	a=a*10+b;
	n=n/10;
	}
	System.out.println(a);
}	
	
}

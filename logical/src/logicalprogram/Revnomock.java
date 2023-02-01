package logicalprogram;

public class Revnomock {
public static void main (String[]args) {
	
int n=456;	
int r=0;
int re;

while(n>0) {
	
re=n%10;
r=(r*10)+re;
n=n/10;
}


	System.out.println(r);
	
	if(n==r) {
	System.out.println("palydrom");
	}
	else
	{
	System.out.println("no polydrom");	
		
	}
}
}	


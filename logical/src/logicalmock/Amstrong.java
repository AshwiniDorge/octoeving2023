package logicalmock;

public class Amstrong {
public void main (String[]args) {
	
for (int i=1;i<=1000;i++)	{

	int n=i;int s=0; int t;
	
while(n>0)	
{	
	t=n%10; s=t*t*t+s;n=n/10;
}
	if(s==i) {
	
	System.out.println(s);
	
	
	
	}
	}
	
}	
}

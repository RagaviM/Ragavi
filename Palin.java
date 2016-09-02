import java.util.Scanner;
class Palin
{
	public static void main(String[] arg)
	{
	int n,m,rev=0,rem;
	System.out.print("Enter the n value : ");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	m=n;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(m==rev)
		System.out.println("It is Palindrom");
	else
		System.out.print("It is not Palindrom");
	
	}
}
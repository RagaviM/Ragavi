import java.util.Scanner;
class Natural
{
	public static void main(String[] arg)
	{
	int n,i;
	int s=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value  of n :");
	n=in.nextInt();
	for(i=1;i<=n;i++)
	{
	s=s+i;
	}
		System.out.println("The sum of natural Numbers : " +s);
	}
}
import java.util.Scanner;
class Factorial
{
	public static void main(String[] arg)
	{
	int n,i,fact=1;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the value of n : ");
	n=in.nextInt();
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.print("The Factorial of a given number : " +fact);
	}
}
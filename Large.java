import java.util.Scanner;
class Large
{
	public static void main(String[] arg)
	{
	int a,b,c;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the value of a,b,c :");
	a=in.nextInt();
	b=in.nextInt();
	c=in.nextInt();
	if(a>b&&a>c)
		System.out.print("a is largest");
	else if(b>c)
		System.out.print("b is largest");
	else
		System.out.print("c is largest");
	}
}
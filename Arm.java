import java.util.Scanner;
class Arm
{
	public static void main(String[] arg)
	{
	int a,b,c,d=0;
	System.out.print("Enter the value of a : ");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	while(a>0)
	{
		b=a%10;
		c=b*b*b;
		a=a/10;
		d=c+d;
	}
	if(a==d)
		System.out.print("It is an Armstrong number");
	else
		System.out.print("It is an not Armstrong number");
	}
}
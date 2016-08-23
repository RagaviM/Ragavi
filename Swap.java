import java.util.Scanner;
class Swap
{
	public static void main(String[] arg)
	{
		int a,b,tmp;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the value a, b : ");
		a=in.nextInt();
		b=in.nextInt();
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("value of a : " +a);
		System.out.print("value of b : " +b);	
	}
}
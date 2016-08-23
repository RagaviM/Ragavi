import java.util.Scanner;
class Swapb
{
	public static void main(String[] arg)
	{
		int a,b;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the value a, b : ");
		a=in.nextInt();
		b=in.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("value of a : " +a);
		System.out.print("value of b : " +b);	
	}
}
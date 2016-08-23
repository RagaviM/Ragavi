import java.util.Scanner;
class Leap
{
	public static void main(String[] arg)
	{
		int i;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the i value : ");
		i=in.nextInt();
	if(i%4==0)
		System.out.println("Leap year");
	else
		System.out.println("Non-Leap year");
	}
}
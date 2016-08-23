import java.util.Scanner;
class Reverseno
{
	public static void main(String[] arg)
	{
	int i,reverse=0;
	System.out.print("Enter the value of i : ");
	Scanner in=new Scanner(System.in);
	i=in.nextInt();
	while(i>0)
	{
	reverse=reverse*10;
	reverse=reverse+i%10;
	i=i/10;
	}
	System.out.print("The Reverse number is : " + reverse);
	}
}
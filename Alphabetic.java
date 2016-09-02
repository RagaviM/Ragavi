import java.util.Scanner;
class Alphabetic
{
public static void main(String args[])
{
char ch;
Scanner in=new Scanner(System.in);
System.out.println("enter the charcter");
ch=in.next().charAt(0);
if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
{
System.out.println("ch+  is an alphabetic");
}
else
{
System.out.println("ch+ is not an alphabetic");
}
}
}

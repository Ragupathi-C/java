import java.util.Scanner;
public class IfElse
{
public static void main(String [] args)
{
System.out.print("Enter a number to check whether it is even or odd number");
System.out.print("Enter the number =");
Scanner sa = new Scanner(System.in);
int num = sa.nextInt();
if(num%2==0)
{
System.out.print("it is a even number");
}
else
{
System.out.print("it is a odd number");
}
}
}

import java.util.Scanner;
public class SwapUserInput
{
public static void main(String [] args)
{
System.out.print("enter the value of a=");
Scanner sa=new Scanner(System.in);
int a=sa.nextInt();
System.out.print("enter the value of b=");
Scanner sb=new Scanner(System.in);
int b=sb.nextInt();
int c=b+a;
int d=c-b;
int e=c-a;
System.out.println("the swap value of a ="+e);
System.out.println("the swap value of b ="+d);
}
}
import java.util.Scanner;
public class SimpleCalculator
{
public static void main(String srgs[])
{
System.out.print("enter the value of A=");
Scanner sa = new Scanner(System.in);
int a=sa.nextInt();
System.out.print("enter the value of B=");
Scanner sb = new Scanner(System.in);
int b=sb.nextInt();
int c=a+b;
int d=a-b;
int e=a%b;
int f=a*b;
int g=a/b;
System.out.println("the addition is ="+c);
System.out.println("the subtraction is ="+d);
System.out.println("the modulus is ="+e);
System.out.println("the multiplication is ="+f);
System.out.println("the division is ="+g);
}
}




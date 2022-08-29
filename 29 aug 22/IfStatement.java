import java.util.Scanner;
public class IfStatement
{
public static void main(String args[])
{
System.out.println("Check whether you are eligible");
System.out.print("enter your age :");
Scanner sa=new Scanner(System.in);
int age=sa.nextInt();
if(age<=18)
{
System.out.println("Sorry!you are not eligible...");
}
}
}



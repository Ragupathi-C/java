import java.util.Scanner;
public class NestedIf
{
public static void main(String []args)
{
System.out.print("Enter your Age :");
Scanner sa=new Scanner(System.in);
int age=sa.nextInt();
System.out.print("Enter your Weight :");
Scanner sb=new Scanner(System.in);
int weight=sb.nextInt();

if(age>=18)
{
if(weight>=50)
{
System.out.println("You are Eligible");
}
else{
System.out.println("Sorry!You are Under Weight");
}
}
else{
System.out.println("Sorry!You are too Young");
}
}
}
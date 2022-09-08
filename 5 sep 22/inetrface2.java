interface Printable
{
void print();
}
interface Showable
{
void show();
}
class inetrface2 implements Printable,Showable
{
public void print()
{
System.out.println("Hello");
}
public void show()
{
System.out.println("World");
}
public static void main(String args[])
{
inetrface2 pr=new inetrface2();
pr.print();
pr.show();
}
}

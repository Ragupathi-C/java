abstract class Evehicle
{

abstract void BikeStart();
abstract void run();


}
class pranah extends Evehicle
{
void BikeStart()
{System.out.println("bike is created");}

void run()
{
System.out.println("running safely");}
}
public class Testing
{
public static void main(String [] args)
{
Evehicle abc=new pranah();
abc.BikeStart();
abc.run();

}
}

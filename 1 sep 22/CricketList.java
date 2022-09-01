class Cricketer
{
int ranking;
String name;
String format;

void Data(int r,String n,String fr)
{
int ranking =r;
String name=n;
String format=fr;
System.out.println("the players ranking, name,format are :" +r +n +fr);
}
}

public class CricketList
{
public static void main(String [] args)
{

Cricketer player1=new Cricketer();
Cricketer player2=new Cricketer();
Cricketer player3=new Cricketer();

player1.Data(1 ," Babar Azam"," t20");
player2.Data(2 ," David Malan"," t20");
player1.Data(3 ," Virat kholi"," t20");

}
}

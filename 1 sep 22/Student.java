class Data
{
int age;
String name;
String doj;
}
class Student
{
public static void main(String [] args)
{
Data ab=new Data();
Data bc=new Data();
Data ca=new Data();

ab.age=20;
ab.name="alex";
ab.doj="5/aug/22";

bc.age=32;
bc.name="livingstone";
bc.doj="4/apr/22";

ca.age=14;
ca.name="hales";
ca.doj="4/sep/22";

System.out.println(ab.age+""+ab.name+" "+ab.doj);
System.out.println(bc.age+""+bc.name+" " +bc.doj);
System.out.println(ca.age+""+ca.name+" "+ca.doj);
}
}



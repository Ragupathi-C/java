class Student
{
	int id;
	String name;
	String doj;
}
class Data
{
public static void main(String [] ags)
{
Student abcd=new Student();
Student efgh=new Student();

abcd.id=11;
abcd.name="ragu";
abcd.doj="4 aug";

efgh.id=12;
efgh.name="pathi";
efgh.doj="5 aug";

System.out.println(abcd.id+ " "+abcd.name+" "+abcd.doj);
System.out.println(efgh.id+ " "+efgh.name+" "+efgh.doj);
}
}


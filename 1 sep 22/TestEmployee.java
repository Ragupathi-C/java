class Employee
{
	int id;
	String name;
	float salary;
	
	void insert(int h,String g,float c)
	{
	id=h;
	name=g;
	salary=c;
	}
	void display(){System.out.println(id +" " +"name"+" "+salary);}
}
public class TestEmployee
{
	public static void main(String []  args)
	{
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	
	e1.insert(11,"rahul",10000);
	e2.insert(12,"gokul",20000);
	e1.insert(13,"vijay",30000);
	
	e1.display();
	e2.display();
	e3.display();
	}
}

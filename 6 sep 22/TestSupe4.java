class Employee{
int id;
String name;
Employee(int id,String name)
{
this.id=id;
this.name=name;
}
}
class EmpSts extends Employee{
float salary;
EmpSts(int id,String name,float salary)
{
super(id,name);
this.salary=salary;
}
void display()
{
System.out.println(id+","+name+","+salary);
}
}
class TestSupe4{
public static void main(String[]args){
EmpSts emp=new EmpSts(11,"Ragupathi",50000);
emp.display();
}
}


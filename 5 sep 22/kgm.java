class animal{
void eat()
{
System.out.println("method eat");
}
}
class pig extends animal
{
void walk()
{
System.out.println("method walk");
}
}
class snake extends pig
{
void bite()
{
System.out.println("die");
}
}
class kgm{
public static void main(String args[])
{
snake s = new snake();
s.eat();
s.walk();
s.bite();
}
}




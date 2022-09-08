class Animal{
void eat()
{System.out.println("hunt");
}
}
class Dog extends Animal{
void walk(){System.out.println("walking");}
void running(){System.out.println("Running");}
void baby(){super.eat();
walk();}
}

class TestSupe2{
public static void main(String[]args){
Dog meo=new Dog();
meo.running();
meo.baby();
}
}


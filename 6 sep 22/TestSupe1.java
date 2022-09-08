class Animal{
String color="White";
}
class Dog extends Animal{
String color="Blacky";
void eats(){
System.out.println(color);
System.out.println(super.color);
}
}
class TestSupe1{
public static void main(String[]args){
Dog ddd=new Dog();
ddd.eats();
}
}


class Animal
{Animal(){System.out.println("Animal Created");}
}
class BabyDoll extends Animal{
BabyDoll(){
super();
System.out.println("BabyDoll Created");
}
}
class TestSupe3{
public static void main(String[]args){
BabyDoll baby=new BabyDoll();
}
}


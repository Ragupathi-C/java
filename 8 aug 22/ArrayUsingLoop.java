import java.util.Scanner;
class ArrayUsingLoop{
public static void main(String[]args){
System.out.println("enter the no of element");
Scanner abc=new Scanner(System.in);
int n=abc.nextInt();

int arr[]=new int[n];
System.out.println("enter the values of element");
for(int i=0;i<n;i++){
arr[i]=abc.nextInt();
}

System.out.println("\narray elements are :");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");}

System.out.println("\nthe even index position are");
for(int i=0;i<n;i++){
if(i%2==0){
System.out.print(arr[i]+", ");
System.out.println("\nthe odd index position are:");
}
}
for(int i=0;i<n;n++){
if(i%2!=0){
System.out.println(arr[i]+",");
}

}
}
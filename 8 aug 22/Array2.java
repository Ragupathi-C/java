import java.util.Scanner;
class Array2{
public static void main(String[]args){
System.out.println("enter the length of the array");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();

int arr[]=new int[x];
System.out.println("enter the values");

for(int i=0;i<x;i++){
arr[i]=sc.nextInt();
}
System.out.println("the array elements are");
for(int i=0;i<x;i++){

if(i%2!=0)
{
System.out.println("the array elements is odd " +i+ " " +arr[i]);
}
else{
System.out.println("the array elements is even " +i+ " " +arr[i]);
}
}
}
}
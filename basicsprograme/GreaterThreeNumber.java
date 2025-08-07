import  java.util.*;
class GreaterThreeNumber
{
public static void main (String args[])
{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if(x>y && y>z)
{
System.out.println("x is greater than y");
}
else if(y>z && z<x)
{
System .out.println(" y is greater than z");
}
else
{
System .out.println("z is greater than x");
}
}
}
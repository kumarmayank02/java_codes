import java.util.*;
class Swapping 
{
public static void main (String args[])
{
int  x ,y;
Scanner sc =new Scanner(System.in);
System.out.println("Enter number:");
 x=sc.nextInt();
y=sc.nextInt();
System.out.println("Swapping number:"+x+" "+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("After swapping number :"+x+ " "+y);
}
}
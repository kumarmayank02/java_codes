import java.util.*;
class Add2
{
int a ,b,s;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the any number");
a=sc.nextInt();
b=sc.nextInt();
}
void sum()
{
s=a+b;
}
void display()
{
System.out.println("The sum of numbers is :"+s);
}
}
class Add3
{
public static void main(String args[])
{
Add2 obj=new Add2();
   obj.getdata();
   obj.sum();
  obj.display();
}
}

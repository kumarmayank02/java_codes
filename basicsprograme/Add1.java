import java.util.*;
class Add
{
int x,y,z;
void getdata()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number");
x=sc.nextInt();
y=sc.nextInt();
}
void sum()
{
z=x+y;
}
void display()
{
System.out.println("sum is="+z);
}
}
class Add1
{
public static void main(String args[])
{
Add obj=new Add();
obj.getdata();
obj.sum();
obj.display();
}
}

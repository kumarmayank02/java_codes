import java.util.Scanner;
class A 
{
int x;
void getdata()
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter any number :");
x=sc.nextInt();
}
}
interface B
{
final int y=0;
void display();
}
class C extends A implements B
{
int m,z;
void getdata2()
{
Scanner sc=new Scanner (System.in);
System.out.println ("Enter any number :");
m=sc.nextInt();
}
void calculate()
{
z=x*y+m;
}
public void display()
{
System.out.println("Result="+z);
}
} class C1
{
public static void main (String args[])
{
C obj=new C();
obj.getdata();
obj.getdata2();
obj.calculate();
obj.display();
obj.display();
}
}


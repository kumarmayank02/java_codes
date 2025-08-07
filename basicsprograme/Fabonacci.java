import java.util.*;
class Fabonacci
{
public static void main (String args[])
{
int num,a=0,b=1,i,c;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number:");
num=sc.nextInt();
System.out.println("Fabonacci Series.......");
System.out.println(b+"  "+a);
for (i=1;i<=num; i++)
{
c=b+a;
System.out.print(" "+c);
b=a;
a=c;
     }
  }
}
import java.util.*;
class Pow
{
public static void main(String args[])
{
int i=1,b,e,r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
e=sc.nextInt();
b=sc.nextInt();
r=1;
for(i=1; i<=e;i++)
{
r*=b;
System.out.println(" "+r);

}
}
}
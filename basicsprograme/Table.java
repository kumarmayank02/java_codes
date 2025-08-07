import java.util.*;
class Table
{
public static void main(String args[])
{
int i,t,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt();
i=1;
while(i<=10)
{
t=n*i;
System.out.println(" "+t);
i++;
}
}
}

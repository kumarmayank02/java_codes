import java.util.*;
class Fact
{
public static void main(String args[])
{
int fact=1,num ,i;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number:");
num=sc.nextInt();
System.out.print("Factorial of number is: ");
for(i=1; i<=num; i++)
{
fact=fact*i;

System.out.print(" "+fact);
}
}
}
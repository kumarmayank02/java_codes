import java.util.Scanner;
class Simple 
{
public static void main(String args[] )
{
int p,r,t;
double si;
System.out.println("Enter the principle:");
Scanner sc =new Scanner(System.in);
 p=sc.nextInt();
System.out.println("Enter the rate:");
r=sc.nextInt();
System.out.println("Enter the time:");
t=sc.nextInt();
si=(p*r*t)/100;
System.out.println("simple interest is"+si);
    }
}
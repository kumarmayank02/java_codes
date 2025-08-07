import java.util.*;
class Asscii
{
public static void main (String args[])
{
char c;
int asciiValue;
System.out.println("Enter any  character");
Scanner sc=new Scanner(System.in);
c=sc.next().charAt(0);
asciiValue=(int) c;
System.out.println("Asccii value of  char is :"+asciiValue);
}
}


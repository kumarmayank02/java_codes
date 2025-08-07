import java.util.*;
class PrimeNumber
{
    public static void main(String args[])
    {
        int j, n, i, n1, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        n = sc.nextInt();
System.out.println("PrimeNumbe are:");
        for (j = 1; j <= n; j++)
        {
            n1 = j;
            c = 0;
            for (i = 1; i <= n1; i++)
            {
                if (n1 % i == 0)
                {
                    c = c + 1;
                }
            }
            if (c == 2)
            {              
                System.out.println(" " + n1);
            } 
}
}
}
 class Sqrt
{
    public static void main(String args[])
    {
        double number = Double.parseDouble(args[0]);
        double squareroot = Math.sqrt(number);
        System.out.printf("Square root of number %.2f is %.2f",number,squareroot);
    }
}
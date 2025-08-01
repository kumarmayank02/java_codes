class ParaCalcu
{
	ParaCalcu(int a ,double b)
{
System.out.println("the sum is "+(a+b));

}
	ParaCalcu(int x,int y)
{
System.out.println("the sub is "+(x-y));

}
	ParaCalcu(float c ,float d)
{
System.out.println("the mult is "+(c*d));

}	ParaCalcu (double e ,double f)
{
System.out.println("the div is "+(e/f));

}	ParaCalcu (int g ,char ch)
{
System.out.println("the rem is "+(g%ch));
 
}
public static void main(String[] args) {
	ParaCalcu t1=new ParaCalcu(10,30);
	ParaCalcu t2=new ParaCalcu(10,3);
	ParaCalcu t3=new ParaCalcu(10.0f,30.0f);
	ParaCalcu t4=new ParaCalcu(10.0,30.0);
	ParaCalcu t5=new ParaCalcu(10,'a');

}
}
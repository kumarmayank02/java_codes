class Addition
{
int x,y,z;
void getdata(int a,int b)
{
x=a;
y=b;
  }
void sum()
{
   z=x+y;
}
void display()
{
System.out.println("value of z="+z);
}
}
class Add2 {
public static void main(String args[]){
Addition obj=new Addition();
obj.getdata(60,70);
obj.sum();
obj.display();

      }
}

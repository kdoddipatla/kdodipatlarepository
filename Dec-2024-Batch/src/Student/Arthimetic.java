package Student;

public class Arthimetic 
{
   public int sum(int a , int b)
{
	   	int c;
	   	c=a+b;
	   	System.out.println("Sum Result  " + c + " Inside Addition Method");
	   	return c;
}
   public int sub(int x , int y)
{
	   	int z;
	   	z=x-y;
	   	System.out.println("Difference Result  " + z + " Inside Subtraction Method");
	   	return z;
}
   public void mul(int a , int b)
{
	   	int c;
	   	c=a*b;
	   	System.out.println("Product Result  " + c + " Inside Multiplaction Method");
}
   public static void main(String[] args) 
   {

   //	System.out.println("I am the Main Method"); ###
   	Arthimetic Expression = new Arthimetic();
    int sumvalue = Expression.sum(20, 0);
    System.out.println("Sum Result Inside Main " + sumvalue);
    int subvalue=Expression.sub(220, 20);
    System.out.println("Difference Result Inside Main " + subvalue);
    Expression.mul(sumvalue, subvalue);
  }
}

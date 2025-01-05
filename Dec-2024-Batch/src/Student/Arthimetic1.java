package Student;

public class Arthimetic1 
{
public int sum(int a , int b)
{
	int c;
	c=a+b;
	System.out.println("Result Of Sum  " + c);
	return c;
}
public int sub(int x,int y)
{
	int z;
	z = x-y;
	System.out.println("Result Of Subtraction " + z);
	return z;
}
public int mul(int x1,int y1)
{
	int z1;
	z1=x1*y1;
	System.out.println("Result Of Multiplication " + z1);
	return z1;
}
public void div(int a1,int b1)
{
	int c1;
	c1=a1/b1;
	System.out.println("Result of Division " + c1);
}
public static void main(String[] args) 
{   System.out.println();
	System.out.println("*********" + "Result For Assignment1" + "************");
	Arthimetic1 Calculation = new Arthimetic1();
	int sum1 = Calculation.sum(10, 2);
	int sum2 = Calculation.sum(sum1, 2);
	int sub1 = Calculation.sub(sum2, 2);
	int mul1 = Calculation.mul(sub1, 2);
	Calculation.div(mul1, 2);
	System.out.println("*********" + "End Of Result For Assignment1" + "************");
	System.out.println();
	System.out.println();
	System.out.println("*********" + "Result For Assignment2" + "************");
	Arthimetic1 Calculation1 = new Arthimetic1();
	int mul2 = Calculation1.mul(10, 2);
	int sub2 = Calculation1.sub(mul2, 2);
	int sum3 = Calculation1.sum(sub2, 2);
	int sub3 = Calculation1.sub(sum3, 2);
	Calculation1.div(sub3, 2);
	System.out.println("*********" + "End Of Result For Assignment2" + "************");
}
}

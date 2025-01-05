package Student;

public class Constructor 
{
public Constructor()
{
	this (11,23,24);
	System.out.println("Default Constructor");
}
public Constructor(int a)
{   
	this ();
	System.out.println("One Parameterized Constructor");
}
public Constructor(int a , int b)
{
	this (1);
	System.out.println("Two Parameterized Constructor");
}
public Constructor(int a , int b ,int c)
{
	System.out.println("Three Parameterized Constructor");
}
public static void main(String[] args) 
{
	Constructor ob = new Constructor(11,22);
}
}

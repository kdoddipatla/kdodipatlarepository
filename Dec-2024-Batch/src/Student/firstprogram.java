package Student;

public class firstprogram 
{
	int rollno ;
	int age;
public void display1()
{
	System.out.println("Welcome To All Of You");
}
public void display2()
{
	System.out.println("Automation Is Very Easy");
}
public static void main(String[] args) 
{
	System.out.println("I am the Main Method");
	firstprogram welcome = new firstprogram();
	welcome.display1();
	welcome.display2();
	welcome.rollno=22;
	welcome.age=48;
	System.out.println(welcome.rollno);
	System.out.println(welcome.age);
	welcome.rollno=02;
	welcome.age=47;
	System.out.println("Reassigning And Priting Rollno And Age Values");
	System.out.println(welcome.rollno);
	System.out.println(welcome.age);
	System.out.println("Comments added after moving to github");
	System.out.println(welcome.rollno);
	System.out.println(welcome.age);
	System.out.println("Comments added after moving to github");
}	
}

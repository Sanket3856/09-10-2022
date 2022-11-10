package oopsconcept;
import java.util.Scanner;
class Student
{
    int id;
    String name,address,course;
    float fees;
    
    void setData(int i,String n,String add,String c,float f)
    {
    	id=i;
    	name=n;
    	address=add;
    	course=c;
    	fees=f;
    }
       void displayData();
       {
    	   System.out.println("Id:"+id);
   		   System.out.println("Name:" +name);
   		   System.out.println("Address:" +address);
   		   System.out.println("Course:" +course);
   		   System.out.println("Fees:" +fees);
       }
}
public class Demo1 {
	public static void main(String []args) {
		Student Sanket=new Student();
		Sanket.setData(101, "Sanket", "Parli", "java full stack", 2000);
		
		Sanket.displayData();
		System.out.println("______________________________");
		
		Student Sujit=new Student();
		Sujit.setData(102, "Sujit", "Pune", "Python", 2500);
		Sujit.displayData();
		
	}
}

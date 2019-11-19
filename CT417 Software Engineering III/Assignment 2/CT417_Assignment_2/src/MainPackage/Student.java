package MainPackage;
import java.util.ArrayList;

public class Student 
{	
	private String name;
	private int age;
	private String username;
	private String DOB;
	private String userID;
	private CourseProgramme course;
	private ArrayList<Module> modules;
	
	public Student(String name, int age, String DOB, CourseProgramme course, ArrayList<Module> modules ) 
	{
		this.name = name;
		this.age = age;
		username = (name + age).replaceAll(" ", "");
		this.DOB = DOB;
		this.course = course;
		this.modules = modules;
	}
	
	public String GetUsername() 
	{
		return username;
	}

}

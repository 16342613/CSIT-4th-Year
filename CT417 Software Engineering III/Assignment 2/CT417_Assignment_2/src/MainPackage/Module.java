package MainPackage;
import java.util.ArrayList;

public class Module 
{
	private String name;
	private String ID;
	private ArrayList<Student> enrolledStudents;
	private ArrayList<CourseProgramme> associatedCourses;
	
	public Module(String name, String ID, ArrayList<Student> enrolledStudents, ArrayList<CourseProgramme> associatedCourses) 
	{
		this.name = name;
		this.ID = ID;
		this.enrolledStudents = enrolledStudents;
		this.associatedCourses = associatedCourses;
	}
	
}

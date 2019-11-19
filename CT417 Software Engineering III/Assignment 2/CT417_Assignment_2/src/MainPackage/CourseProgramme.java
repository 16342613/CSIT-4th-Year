package MainPackage;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgramme 
{
	private String name;
	private ArrayList<Module> modules;
	private ArrayList<Student> enrolledStudents;
	private DateTime startTime;
	private DateTime endTime;
	
	public CourseProgramme(String name, ArrayList<Module> modules, ArrayList<Student> enrolledStudents, DateTime startTime, DateTime endTime)
	{
		this.name = name;
		this.modules = modules;
		this.enrolledStudents = enrolledStudents;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public void addModule(Module module) 
	{
		modules.add(module);
	}
	
}

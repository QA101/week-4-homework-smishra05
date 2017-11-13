public class Student {

	String name;
	int age;
	String studassignedclass;
	String classname;
	int studentid;
	 
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.classname = StudAssignClass(age);
		
		// TODO Auto-generated constructor stub
	}
	
	public String StudentDetails() {
		return "Name: " + name +""+ ", Age: " + age +""+ ", Classname: " + classname;
	}

	public String StudentName() {
		return name;
	}
	
	public int StudentAge()
	{
		return age;
	}
	/**
	 * Based on student's age, we assign the class (School consists of classes uptill 5th class with max. age of 8 years old)
	 */
	public String StudAssignClass(int age)
	{
		if(age==3)
		{
			studassignedclass = "NURSERY";
		}
		else if(age == 4)
		{
			studassignedclass = "CLASS1";
		}
		else if(age == 5)
		{
			studassignedclass = "CLASS2";
		}else if(age == 6)
		{
			studassignedclass= "CLASS3";
		}else if(age == 7)
		{
			studassignedclass = "CLASS4";
		}else if(age == 8)
		{
			studassignedclass= "CLASS5";
		}
		return studassignedclass;
		
	}
	
}

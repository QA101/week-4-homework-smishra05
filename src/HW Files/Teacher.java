public class Teacher {
	
	String name;
	int experience;
	String TeachAssignedClass;
	int employeeid;
	
	public Teacher(String name,int experience) 
	{
		this.name = name;
		this.experience = experience;
		this.TeachAssignedClass=TeachAssignClass(experience);
		
		
	}
	public String TeacherDetails() 
	{
		return ("Name: "+name+", "+"Experience(yrs): "+experience+", "+"AssignedClass: "+TeachAssignedClass);
	}
	public String TeachAssignClass(int experience)
	{
		if(experience==3)
		{
			TeachAssignedClass = "NURSERY";
		}
		else if(experience == 4)
		{
			TeachAssignedClass = "CLASS1";
		}
		else if(experience== 5)
		{
			TeachAssignedClass = "CLASS2";
		}else if(experience == 6)
		{
			TeachAssignedClass = "CLASS3";
		}else if(experience == 7)
		{
			TeachAssignedClass = "CLASS4";
		}else if(experience == 8)
		{
			TeachAssignedClass = "CLASS5";
		}
		return TeachAssignedClass;
		
	}	
		
// TODO Auto-generated constructor stub
}



import java.util.ArrayList;

public class RegistrationRecord {

	ArrayList<Student> StudentRecord = new ArrayList<Student>();
	ArrayList<Teacher> TeacherRecord = new ArrayList<Teacher>();
	
	public void AddStudentRecord(Student newStud) {
	// TODO Auto-generated method stub
		StudentRecord.add(newStud);
				
	}
	public void AddTeacherRecord(Teacher newTeach) 
	{
		// TODO Auto-generated method stub
		TeacherRecord.add(newTeach);
				
	}
	
	public String ReturnStudents() {
		String returnString = "";
		for( Student st : StudentRecord) {
			returnString += st.StudentDetails() + "\n";
		}
		return returnString;
	}
	public String ReturnTeachers() {
		String returnString = "";
		for( Teacher teach : TeacherRecord) {
			returnString += teach.TeacherDetails() + "\n";
		}
		return returnString;
	}
	
	public int SearchTeachers(String searchname) 
	{
		int found = 0;
		for(int i=0;i<TeacherRecord.size();i++)
		{
			if(TeacherRecord.get(i).name.equals(searchname))
			{
				found = i;
				
			}
		
		}
		return found;
	}
		public int SearchStudents(String searchname) 
		{
			int found = 0;
			for(int i=0;i<StudentRecord.size();i++)
			{
				if(StudentRecord.get(i).name.equals(searchname))
				{
					found = i;
				}
			}
			return found;
		}
		public void RemoveStudents(String removeStudName) 
		{
			int index = SearchStudents(removeStudName);
			StudentRecord.remove(index);
		}
		public void RemoveTeachers(String removeTeacherName) 
		{
			int index = SearchTeachers(removeTeacherName);
			TeacherRecord.remove(index);
		}
		
}

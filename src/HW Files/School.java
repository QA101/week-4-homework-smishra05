import java.util.ArrayList;

public class School {
	
	//Variables for this class
	ArrayList<Book> catalog = new ArrayList<Book>();
	String name;
	int numStudents = 0;
	int numTeachers = 0;

	/**
	 * Start the execution of your program here.
	 * 
	 * --------------INSTRUCTIONS----------------
	 * 1. The main method should create a school, add books to its catalog, and print all the books in its catalog.
	 * Use the library class for reference.
	 * 
	 * 2. After printing the books, the program should add students and print the total number of student.
	 * 
	 * 3. Finally, the program should call other methods that you design and print anything that makes sense for a school.
	 * 
	 * Thoughts:
	 * Schools have books, students, teachers, principles, classes.
	 * Add students, remove students, add teachers, open the school, close the school.
	 * 
	 * ----------------CHALLENGE:----------------
	 * 
	 * Can a school have a library? How would this be represented within the school?
	 * 
	 */
	public static void main(String args[]) {
		//RegistrationRecord
		RegistrationRecord studrecord = new RegistrationRecord();
		
		RegistrationRecord teachrecord = new RegistrationRecord();
		
		//TODO create a school (similar to the library)
		School school1 = new School("Seattle Public School");
		//Add Books to Catalog
		school1.addBooks();
		//Print Books and count
		school1.printBooks();
		//AddStudents 
		school1.AddSingleStudent("Soumya",4,studrecord);
		school1.AddSingleStudent("John", 6,studrecord);
		school1.AddSingleStudent("Mary", 3,studrecord);
		//Print Students and count
		System.out.println("Before Removal");
		school1.getStudents(studrecord);
        //Add Teachers
		school1.AddTeacher("MissMary",3,teachrecord);
		school1.AddTeacher("MissPeach",4,teachrecord);
		school1.AddTeacher("MissSunlight",8,teachrecord);
		//Print Teachers and count
		System.out.println("Before Removal");
		school1.getTeachers(teachrecord);
		//Remove Students
		school1.removeStudents("John",studrecord);
		//Remove Teachers
		System.out.println("After 1st Removal");
		school1.getStudents(studrecord);
		school1.removeTeachers("MissPeach",teachrecord);
		System.out.println("After 1st Removal");
		school1.getTeachers(teachrecord);
		
		//Remove Students
		school1.removeStudents("Soumya",studrecord);
		//Remove Teachers
		System.out.println("After 2nd Removal");
		school1.getStudents(studrecord);
		school1.removeTeachers("MissSunlight",teachrecord);
		System.out.println("After 2nd Removal");
		school1.getTeachers(teachrecord);
	}
	
	private void removeTeachers(String name, RegistrationRecord teachrecord) {
		// TODO Auto-generated method stub
		teachrecord.RemoveTeachers(name);
		numTeachers--;
	}

	private void removeStudents(String name,RegistrationRecord studrecord) {
		studrecord.RemoveStudents(name);
		numStudents--;
		// TODO Auto-generated method stub
		
	}

	private void getStudents(RegistrationRecord studrecord) {
		// TODO Auto-generated method stub
		studrecord.ReturnStudents();
		System.out.println(studrecord.ReturnStudents()+"Total Students: "+numStudents);
		System.out.println();
		
	}

	private void getTeachers(RegistrationRecord teachrecord) {
		// TODO Auto-generated method stub
		System.out.println(teachrecord.ReturnTeachers()+"Total Teachers: "+numTeachers);
		System.out.println();
	}

	private void printBooks() {
		// TODO Auto-generated method stub
		System.out.println("Books : "+catalog.toString());
		System.out.println();
	}

	private void addBooks() {
		// TODO Auto-generated method stub
		catalog.add(new Book("AnneFrank", 100, "History", "Anne Frank"));
		catalog.add(new Book("WhoMovedMyCheese", 200, "Drama", "Spencer Johnson"));
		
	}

	/**
	 * Constructs a school.
	 * this.name refers to the global variable for the class. String name is the name we pass in when building the school
	 * @param name
	 */
	public School(String name) {
		this.name = name;
	}
	
	/**
	 * adds a single student to the school
	 */
	public void AddSingleStudent(String name,int age,RegistrationRecord studrecord) 
	{
		studrecord.AddStudentRecord(new Student(name,age));
		numStudents++;
		
		//Do I need a MAX_STUDENTS ???
	}
	
	public void AddTeacher(String name,int experience,RegistrationRecord teacherrecord) 
	{
		teacherrecord.AddTeacherRecord(new Teacher(name,experience));
		numTeachers++;
		//Do I need a MAX_STUDENTS ???
	}                                                                                                                  
	

}

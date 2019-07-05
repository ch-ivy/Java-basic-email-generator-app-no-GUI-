package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String StdID, firstname, lastname,courses = null;  
	private int    tuitionBalance = 0, gradeYear;
	private static int ID = 1000, costOfCourse = 600;
	
	
	//constructor promps students to enter name and year
	public Student()
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Student Firstname");
		this.firstname = scan.nextLine();
		
		System.out.print("\nEnter Student Lastname");
		this.lastname = scan.nextLine();
		
		System.out.print("Enter Student Class Level \n1 For Freshman \n2 For Sophmore \n3 For Junior \n4 For Senior ");
		this.gradeYear = scan.nextInt();
		
		setStudentID();
		System.out.println(firstname + " " + lastname  + "  "+ gradeYear + " " + StdID);
		
		
	}

	//generate ID
	 private void setStudentID()
	 {
		 //gradelevel + static id = dtudent id
		 ID++;
		 this.StdID = gradeYear + "" + ID;
		 
	 }
	
	//Enroll courses
	 public void Enroll()
		 {

		 do
		 {
			 System.out.print("Enter a course to Enroll, 0 to quit");

				 Scanner scan = new Scanner(System.in);
				 String course = scan.nextLine();
				 if(!course.equals("0"))
			 {
				 courses+="\n" + course;
				 tuitionBalance += costOfCourse;
			 }
				 else
				 {
					 break;
				 }
		 }
		 while(1 != 0);
		 System.out.println("EROLLED IN: " + courses);
		 System.out.println("TUITION BALANCE: " + tuitionBalance);
		 
	 }
	
	//View Balance
	
	//Pay tuition
}

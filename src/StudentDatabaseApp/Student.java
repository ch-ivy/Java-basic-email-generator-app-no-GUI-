package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String StdID, firstname, lastname, courses = null;  
	private int    tuitionBalance = 0, gradeYear;
	private static int ID = 1000, costOfCourse = 600;
	
	
	//constructor prompt students to enter name and year
	public Student()
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Student Firstname ");
		this.firstname = scan.nextLine();
		
		System.out.print("\nEnter Student Lastname ");
		this.lastname = scan.nextLine();
		
		System.out.print("Enter Student Class Level \n1 For Freshman \n2 For Sophmore \n3 For Junior \n4 For Senior ");
		this.gradeYear = scan.nextInt();
		
		setStudentID();

		
		
	}

	//generate ID
	 private void setStudentID()
	 {
		 //grade level + static id = student id
		 ID++;
		 this.StdID = gradeYear + "" + ID;
		 
	 }
	
	//Enroll courses
	 public void Enroll()
		 {

		 do
		 {
			 System.out.print("Enter a course to Enroll, 0 to quit ");

				 Scanner scan = new Scanner(System.in);
				 String course = scan.nextLine();
				 if(!course.equals("0"))
			 {
				 courses+="\n   " + course;
				 tuitionBalance += costOfCourse;
			 }
				 else
				 {
					 break;
				 }
		 }
		 while(1 != 0);

		 
	 }
	
	//View Balance
	 public void viewBalance()
	 {
		 System.out.println("Your Balance is : " + tuitionBalance);
	 }
	
	//Pay tuition
	 
	 public void payTuition()
	 { 
		 viewBalance();
		 System.out.println("Enter payment for courses!");
		 Scanner in = new Scanner(System.in);
		 int payment = in.nextInt();
		 tuitionBalance -= payment;
		 System.out.println("Thank you for your payment of " + payment);
		 viewBalance();
	 }
	 //show status
	 public String showinfo()
	 {
		 return "Name : " + firstname + " " + lastname + "\nGrade Level : " + gradeYear + "\nStuden ID: " + StdID +
				 "\n Courses Enrolled => " + courses + "\nTuition Balance: $" + tuitionBalance;
	 }
}

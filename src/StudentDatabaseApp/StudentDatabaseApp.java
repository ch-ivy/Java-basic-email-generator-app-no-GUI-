package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//asking for number of students to add to the database
		
		System.out.print("Enter number of students you want to enroll");
		Scanner scan = new Scanner(System.in);
		int stdnum = scan.nextInt();
		Student[] students = new Student[stdnum];
		//create new students
		for(int n = 0; n < stdnum ; n++)
		{
			students[n] = new Student();
			students[n].Enroll();
			students[n].payTuition();
			
		}
		System.out.println("ENROLLED STUDENTS INFO : \n");
		for(int i = 0; i < stdnum; i++ )
		{
			
			System.out.println(students[i].showinfo());
		}
	}

}

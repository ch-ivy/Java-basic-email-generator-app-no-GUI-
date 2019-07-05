package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String alternateEmail, email;
	private int  mailboxCapacity, defaultPasswordLength = 10;
	
	//Constructor to receive the first name and last name
	public Email (String firstname, String lastname)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email Created: " + firstname +" " + lastname);
		this.department = setdepartment();
		
		//calling a method that asks for department and returns it
		System.out.println("Department: " + this.department);
		
		//calling a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password is : " + this.password);
		
		//combine informations to generate email in the format firstname.lastname@department.company.com
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + this.department + ".webstronomers.com";
		System.out.println("Your email is : " + email);
	}
	//ask for department
	private String setdepartment()
	{
		System.out.print("DEPARTMENT CODES:\n1 For Sales \n2 For Development \n3 For Accounting \n0 For None 	\nEnter Department Code!");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1)
		{
			return "Sales";
		}
		else if(depChoice == 2)
		{
			return "Development";
		}
		else if (depChoice == 3)
		{
			return "Accounting";
		}
		else 
		{
			return "";
		}
	}
	//generate a random password
	 private String randomPassword(int length)
	 {
		 String PasswordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_-+=";
		 char[] password = new char[length];
		 for(int i=0 ; i < length; i++)
		 {
			 int rand = (int) (Math.random() * PasswordSet.length());
			 password[i] = PasswordSet.charAt(rand);
		 }
		 
		 return new String(password);
	 }
	//set the mailbox capacity
	
	//set the alternate email
	
	//change the password
}

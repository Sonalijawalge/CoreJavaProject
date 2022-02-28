package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultpasswordlength = 8;
	private String alternateEmail;
	private String companySyffix = "ablcompany.com";
	
	//Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	System.out.println("EMAIL CREATED:" + this.firstName + " " + this.lastName );
	
	//call a method asking for the department . return the department
	 this.department = setDepartment();
	 System.out.println("Department: " + this.department);
	 
	 //Call a method that returns a random password
	 this.password =randomPassword(defaultpasswordlength);
	 System.out.println("Your password is: " +this.password);
	 
	 //combine elements to generate email
	 email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySyffix;
	 System.out.println("Your Email is:" + email);
	}
	
	//Ask for the departement
	private String setDepartment() {
		System.out.println("Department Codes:\n1 for sell\n2 for Devolpement \n3 for accounting\n0 for none\nEnter department code");
		Scanner sc = new Scanner (System.in);
		int depChoice = sc.nextInt();
		if (depChoice ==1) { return "sales" ;}
		else if (depChoice == 2) {return "development" ;}
		else if (depChoice ==3) { return "Accounting" ;}
		else {return " ";}		
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "Abcd@123";
		char[] password =new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
		
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String alternateEmail) {
	this.alternateEmail = alternateEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity() {
		return mailboxCapacity;	}
	public String getAlternateEmail() {
		return alternateEmail; }
	public String getPassword() {return password; }
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				
				"\nCOMPANY EMAIL: " + "" + email +
				
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb"; }

		
	}	
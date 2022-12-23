package javacamp_D3;

import java.io.ObjectInputStream.GetField;

public class Main {

	public static void main(String[] args) {
		
		  Instructor ınstructor1 = new Instructor(1234567, "Engin", "Demiroğ", "Java Camp",2015);  
		  
		  Instructor ınstructor2 = new Instructor(8934567, "Bahar", "Yaman", "Python Camp", 2015);
		  
		  Instructor[] ınstructors = {ınstructor1,ınstructor2};
		  
		  Student student1 = new Student(567890,"Ece", "Çabukçu","Haliç University", 2);
		  
		    UserManager usermanager = new UserManager();
	        usermanager.addUser(student1);
	        StudentManager studentmanager = new StudentManager();
	        studentmanager.addStudentInfo(student1);
	        InstructorManager ınstructormanager = new InstructorManager();
	        ınstructormanager.addInstructorInfo(ınstructor1);

		  
		  System.out.println(student1.getFirstName());
		  System.out.println(ınstructor1.getFirstName());
		  System.out.println(ınstructor2.getFirstName());
		  
		  

		  
		
		  
		   
		
		
	}

}

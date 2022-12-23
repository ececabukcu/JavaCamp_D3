package javacamp_D3;

public class Student extends User {
	
	public Student(int id, String firstName, String lastName, String universty, int grade) {
		super(id, firstName, lastName);
		this.universty = universty;
		this.grade = grade;
	}
	
	String universty;
	 int grade;
	
	public String getUniversty() {
		return universty;
	}
	public void setUniversty(String universty) {
		this.universty = universty;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
	
	
	
	
	
	
	

}

package javacamp_D3;

public class Instructor extends User{
	
	private String courseName;
	private int startYear;
	
	public Instructor(int id, String firstName, String lastName, String courseName, int startYear) {
		super(id, firstName, lastName);
		this.courseName = courseName;
		this.startYear = startYear;
	}
	

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}


}

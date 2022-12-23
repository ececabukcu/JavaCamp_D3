package javacamp_D3;

public class StudentManager {
	
	public void addStudentInfo(Student Student) {
		
		System.out.println(Student.getFirstName() + " " + Student.getLastName() 
		+ " isimli " + Student.getId() + " numaralı öğrencinin kaydı alınmıştır. "
		+ "Genel bilgiler: \n" + "Üniversite: " + Student.getUniversty() 
		+ " Sınıf: " + Student.getGrade());
		
		
	}

}

package javacamp_D3;

public class InstructorManager {
	
	public void addInstructorInfo(Instructor Instructor) {
		
		System.out.println(Instructor.getFirstName() + " " + Instructor.getLastName() 
		+ " isimli " + Instructor.getId() + " numaralı eğitmenin kaydı alınmıştır. "
		+ "Genel bilgiler: \n" + "Vereceği ders: " + Instructor.getCourseName()
		+ " İşe başlama yılı: " + Instructor.getStartYear());
	}

}

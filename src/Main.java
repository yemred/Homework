

public class Main {

	public static void main(String[] args) {
		
		UserManager userManagerStudent = new StudentManager();
		UserManager userManagerInstructor = new InstructorManager();
		
		Student student = new Student();
		
		String[] dersler = {
				"Matematik",
				"türkçe"
				};
		
		student.setId(1);
		student.setFirstName("Emre");
		student.setLastName("Duymaz");
		student.setPhoneNumber("1231321");
		student.setStudentNumber("12");
		student.setTakedLecture(dersler);
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("deneme_Ad");
		instructor.setLastName("deneme_Soyad");
		instructor.setId(1);
		instructor.setLessonId(1);
		instructor.setPhoneNumber("12313");
		
		
		userManagerStudent.add(student);
		userManagerInstructor.add(instructor);
		

	}

}

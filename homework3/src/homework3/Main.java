package homework3;

public class Main {

	public static void main(String[] args) {
			
		User student = new Student(1, "Salih", "Özdemir", "zsalihozdemir@gmail.com", "12345");
		
		User instructor = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "78910");
		

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.remove(student);
		studentManager.update(student);
		studentManager.joinCourse(student);
		studentManager.leaveCourse(student);
		
		
		System.out.println("-----------------------------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.remove(instructor);
		instructorManager.update(instructor);
		instructorManager.addToCourse(instructor);
		instructorManager.removeCourse(instructor);
	}

}

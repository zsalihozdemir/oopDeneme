package homework3;

public class InstructorManager {

	public void add(User instructor) {
		System.out.println("E�itmen: "+instructor.getFirstName()+ " eklendi");
	}
	
	public void remove(User instructor) {
		System.out.println("E�itmen kayd� silindi");
	}
	
	public void update(User instructor) {
		System.out.println("E�itmen bilgileri g�ncellendi");
	}

	public void addToCourse(User instructor) {
		System.out.println("Kurs "+instructor.getFirstName()+ " taraf�ndan eklendi.");
	}

	public void removeCourse(User instructor) {
		System.out.println("Kurs "+instructor.getFirstName()+ " taraf�ndan kald�r�ld�.");
	}
}




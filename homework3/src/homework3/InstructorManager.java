package homework3;

public class InstructorManager {

	public void add(User instructor) {
		System.out.println("Eðitmen: "+instructor.getFirstName()+ " eklendi");
	}
	
	public void remove(User instructor) {
		System.out.println("Eðitmen kaydý silindi");
	}
	
	public void update(User instructor) {
		System.out.println("Eðitmen bilgileri güncellendi");
	}

	public void addToCourse(User instructor) {
		System.out.println("Kurs "+instructor.getFirstName()+ " tarafýndan eklendi.");
	}

	public void removeCourse(User instructor) {
		System.out.println("Kurs "+instructor.getFirstName()+ " tarafýndan kaldýrýldý.");
	}
}




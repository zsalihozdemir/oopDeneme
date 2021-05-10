package homework3;

public class StudentManager {
	
	public void add(User student) {
		System.out.println("Öðrenci: "+student.getFirstName()+" eklendi");
	}

	public void remove(User student) {
		System.out.println("Öðrenci silindi");
	}

	public void update(User student) {
		System.out.println("Öðrenci bilgileri güncellendi");
	}
	
	public void joinCourse(User student) {
		System.out.println("Kursa baþarýyla kaydoldun "+student.getFirstName());
	}

	public void leaveCourse(User student) {
		System.out.println("Kurstan ayrýldýn "+student.getFirstName());
	}
}



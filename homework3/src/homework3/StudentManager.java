package homework3;

public class StudentManager {
	
	public void add(User student) {
		System.out.println("��renci: "+student.getFirstName()+" eklendi");
	}

	public void remove(User student) {
		System.out.println("��renci silindi");
	}

	public void update(User student) {
		System.out.println("��renci bilgileri g�ncellendi");
	}
	
	public void joinCourse(User student) {
		System.out.println("Kursa ba�ar�yla kaydoldun "+student.getFirstName());
	}

	public void leaveCourse(User student) {
		System.out.println("Kurstan ayr�ld�n "+student.getFirstName());
	}
}



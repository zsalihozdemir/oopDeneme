package odev2;

public class Main {
	
	public static void main(String[] args) {
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# & ANGULAR)", "Engin Demiroð",  0);
		
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)", "Engin Demiroð", 32);
		
		Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs", "Engin Demiroð", 0);
		
		
	
		Course[] courses = {course1, course2, course3};
		
		
		System.out.println("---------KURSLAR--------");
		
		for (Course course: courses) {
			
			System.out.println("Kurs adý: "+course.courseName + "/ Eðitmen: "+course.instructor);
			
			System.out.println("-----------------------------------------------------------------");
		}
		
		
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.addToList(course1);
		courseManager.progress(course1);
		System.out.println("-----------------------------------------------------------------");
		courseManager.addToList(course2);
		courseManager.progress(course2);
		System.out.println("-----------------------------------------------------------------");
		courseManager.addToList(course3);
		courseManager.progress(course3);
		
	}

}
	
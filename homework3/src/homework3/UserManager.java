package homework3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c�: "+user.getFirstName()+user.getLastName()+ " ba�ar�yla eklendi");
	}
	
	public void remove(User user) {
		System.out.println("Kullan�c� silindi");
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� bilgileri g�ncellendi");
	}
}

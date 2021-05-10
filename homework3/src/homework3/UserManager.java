package homework3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanýcý: "+user.getFirstName()+user.getLastName()+ " baþarýyla eklendi");
	}
	
	public void remove(User user) {
		System.out.println("Kullanýcý silindi");
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý bilgileri güncellendi");
	}
}

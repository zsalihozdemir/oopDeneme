package homework3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanıcı: "+user.getFirstName()+user.getLastName()+ " başarıyla eklendi");
	}
	
	public void remove(User user) {
		System.out.println("Kullanıcı silindi");
	}
	
	public void update(User user) {
		System.out.println("Kullanıcı bilgileri güncellendi");
	}
}

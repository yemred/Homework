
public class StudentManager extends UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" adl� ��renci eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" adl� ��renci silindi");
	}
	public void takeLecture() {
		System.out.println("");
	}
	public void dropLecture() {
		System.out.println("");
	}
}

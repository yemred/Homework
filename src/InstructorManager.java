
public class InstructorManager extends UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName()+" adl� ��retmen eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" adl� ��retmen silindi");
	}
	
}

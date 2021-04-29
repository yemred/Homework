
public class InstructorManager extends UserManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName()+" adlý öðretmen eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getFirstName()+" adlý öðretmen silindi");
	}
	
}

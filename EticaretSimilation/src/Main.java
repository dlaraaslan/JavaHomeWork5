import JClickVerificationLink.JClickManager;
import JConfirmationEmail.JEmailManager;
import dataAccess.concretes.HibernateUserDao;
import business.abstracts.UserService;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao(),new JEmailManager());
		
	}

}

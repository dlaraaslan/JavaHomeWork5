package business.concretes;

import business.abstracts.UserService;
import core.GoogleService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private User user;
	private UserDao userDao;
	private GoogleService googleService;
	

	public UserManager(User user, UserDao userDao, GoogleService googleService) {
		super();
		this.user = user;
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void register(String firstName, String lastName, String email, String password) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		if(password.length() > 6 
				&& firstName.length() > 2 
				&& lastName.length() > 2 
				&& user.getEmail().matches(regex) 
				&& !(userDao.getAllEmail().contains(user.getEmail()))) 
		{
			System.out.println("Doðrulama emaili gönderildi");
			userDao.add(user);
			
		}else {
			System.out.println("üyelik oluþturulamadý.");
		}
		
	}

	@Override
	public void login(String email, String password) {
		if(password == user.getPassword() && email == user.getEmail()) {
			System.out.println("Giriþ Baþarýlý. ");
		}else {
			System.out.println("Parola veya email yanlýþ.");
		}
		
	}

	

}

package business.abstracts;


public interface UserService {
	void register(String firstName, String lastName,String email, String password);
	void login(String email, String password);
}

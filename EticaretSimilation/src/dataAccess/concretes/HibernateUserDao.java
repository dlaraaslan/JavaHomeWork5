package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kay�t olu�turuldu. " + user.getEmail());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kay�t g�ncellendi. " + user.getEmail());		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kay�t silindi. " + user.getEmail());		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getAllEmail() {
		System.out.println("t�m mailler: ");
		return null;
	}

}

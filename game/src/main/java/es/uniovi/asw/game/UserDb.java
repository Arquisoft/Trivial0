package es.uniovi.asw.game;

public class UserDb {
	
	Integer size = 0;
	
	public void addUser(String name, String password) {
		size += 1;
	}
	
	public Integer size() {
		return size;
	}
	

}

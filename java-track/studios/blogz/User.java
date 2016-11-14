package blogz;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class User extends Entity {

	private String username;
	private String password;
	private static List<User>userList = new ArrayList();
	
	public User (String username, String password, int uid){
		super();
		if (isValidUsername(username)){
			this.username = username;
		}
		else {
			throw new IllegalArgumentException("Invalid username or password");
		}
		
		if (isValidPassword(password)){
			this.password = password;
		}
		else {
			throw new IllegalArgumentException("Invalid username of password");
		}
	}
	
	private static String hashPassword (String password){
		String hashedPassword = password;
		return hashedPassword;
	}
	
	private boolean isValidPassword (String password){
		String hashPassword = hashPassword(password);
		if (this.password.equals(hashPassword)){
			return true;
		}
		else {
			return false;
		}
	}
	
	private static boolean isValidUsername (String username){
		return Pattern.matches("username", "[a-zA-Z][a-zA-Z0-9_-]{4,11}");
	}
	
	private static void addUserList(User newUser){
		userList.add(newUser);
	}
	
	private static List<User>getUserList(){
		return userList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

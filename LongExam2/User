import java.util.ArrayList;

public class User {

String name, age, birthday, userName, password;
	
	public User(String uName, String pass) {
		this.userName = uName;
		this.password = pass;
	}
	
	public String getUsername() {
		return userName;
	}
	
	public void setUsername(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
  // Checks if input password is valid
	public boolean checkPassword(String password) {
	    // Check for minimum length
	    if (password.length() < 8) {
	        return false;
	    }
	    
	    // Check for uppercase, lowercase, numeric and special characters
	    boolean hasUppercase = false;
	    boolean hasLowercase = false;
	    boolean hasNumber = false;
	    boolean hasSpecialChar = false;
	    String specialChars = "!@#$%^&*()_+-=[]{}|;:',.<>/?";
	    
	    for (int i = 0; i < password.length(); i++) {
	        char c = password.charAt(i);
	        if (Character.isUpperCase(c)) {
	            hasUppercase = true;
	        } else if (Character.isLowerCase(c)) {
	            hasLowercase = true;
	        } else if (Character.isDigit(c)) {
	            hasNumber = true;
	        } else if (specialChars.contains(String.valueOf(c))) {
	            hasSpecialChar = true;
	        }
	        
	        if (hasUppercase && hasLowercase && hasNumber && hasSpecialChar) {
	            return true;
	        }
	    }
	    
	    return false;
	}
	
  // Checks if input username is valid
	public boolean checkValidUsername(String username) {
		ArrayList<String> validEmails = new ArrayList<>();
			validEmails.add("@gmail.com");
			validEmails.add("@yahoo.com");
			validEmails.add("@hotmail.com");
			validEmails.add("@students.national-u.edu.ph");
		
		for (String search : validEmails) {
	        if (username.contains(search)) {
	        	return true;
	        }   	
		}
		
		return false;
	}
}

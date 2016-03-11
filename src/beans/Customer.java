package beans;

public class Customer {
	
	private final String id;
	private final String name;
	private final String email;
	
	public Customer(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	
	/*
	public boolean validate() {
		
		if(email == null) {
			message = "No email address set.";
			return false;
		}
		if(password == null) {
			message = "No password set.";
			return false;
		}
		
		if(!email.matches("\\w+@\\w+\\.\\w+")) {
			message = "Invalid email address";
			return false;
		}
		

		if(password.length() < 8) {
			message = "password must be at least 8 characters";
			return false;
		}
		else if (!password.matches("\\w*\\S+\\w*") ) {
			message = "Password canot contain space.";
			return false;
		}
		return true;
		
	} */
}


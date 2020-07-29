public class Account {
	
	/**
	* Create the constructor that takes the following:
	* First name
	* Last name
	* Email
	* Password
	**/
	
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	
	public Account()
	{
		this.firstName = "QA";
		this.lastName = "test";
		this.emailId = "qa.revati@venngage.com";
		this.password = "123456";
	}
	
	// Create the necessary Getter functions
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmailId() {
		return emailId;
	}
	
	public String getPassword() {
		return password;
	}
}
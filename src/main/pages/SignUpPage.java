public class SignUpPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String firstNameInput = "/html/body/div[1]/div/div/div/div[2]/div[2]/form/div[1]/div/div[1]/input";
	
	private static final String firstName = "//*[@id='user_first_name']";
	private static final String lastName = "//*[@id='user_last_name']";
	private static final String emailId = "//*[@id='user_email']";
	private static final String password = "//*[@id='user_password']";
	private static final String signUpButton = "//*[@id='btn_register']";
	
	public SignUpPage(){
		this.selenium = Selenium();
	}
	
	// Create a function that takes an Account and simulates signing up using Selenium actions. (Refer to Selenium.java)
	
	public void signUp(Account acc) {
		selenium.sendKeys(firstName,acc.getFirstName());
		selenium.sendKeys(lastName,acc.getLastName());
		selenium.sendKeys(emailId,acc.getEmailId());
		selenium.sendKeys(password,acc.getPassword());
		selenium.clickByXpath(signUpButton);		
	}
	}
}
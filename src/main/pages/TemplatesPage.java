public class TemplatesPage {
	
	private Selenium selenium;
	
	// Add XPaths here
	private static final String signUp = "//button[@data-hover='Sign Up']";
	
	public TemplatesPage(){
		this.selenium = Selenium();
	}
	
	// Create a function that clicks on the Sign Up button
	public void clickSignUpFromATemplate() {
		selenium.clickByXpath(signUp);
	}
	
	
}
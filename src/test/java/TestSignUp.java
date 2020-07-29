import util.Selenium;

public class TestSignUp {
	
	private Account account;
	private SignUpPage signUpPage;
	
	@Before
	public void setUp(){
		// Instantiate page objects here
		Selenium selenium = new Selenium();
		selenium.goToUrl("https://venngage.com/templates");
		
	}
	
	@Test
	public void testSignUp(){
		// Write test steps here
		TemplatesPage tp = new TemplatesPage();
		tp.clickSignUpFromATemplate();

		signUpPage.signUp(account);
	}
}

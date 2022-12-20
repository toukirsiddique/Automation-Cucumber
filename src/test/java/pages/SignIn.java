package pages;

import org.openqa.selenium.By;

public class SignIn extends BasePage {
	
	public final By USERNAME = By.xpath("//input[@id='j_username']");
	public final By PASSWORD = By.xpath("//input[@id='j_password']");
	public final By SIGNINBUTTON = By.xpath("//button[normalize-space()='Sign In']");

	public final By ERROR_MESSAGE = By.xpath("alert alert-danger");
	
	public void enterUsername(String username) {
		writeText(USERNAME, username);
	}
	
	
	public void enterPassword(String password) {
		writeText(PASSWORD, password);
	}
	
	public void clickSigninButton() {
		clickOnElement(SIGNINBUTTON);
	}
	
	public void doLogIn(String username, String password) {
		writeText(USERNAME, username);
		writeText(PASSWORD, password);
		clickOnElement(SIGNINBUTTON);
	}

}

package pageObject;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.testng.annotations.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SignInTest{

	private WebDriver driver;
	@Test
	public void signIn() {
		SignInPage page = new SignInPage(driver);
		page.navigateHome();
		page.wrongSignIn();
		WebElement incorrectFormat = driver.findElement(By.id("modal-txt-signin-email-email-format-error"));
		Assert.assertNotNull(incorrectFormat);;
	}

}



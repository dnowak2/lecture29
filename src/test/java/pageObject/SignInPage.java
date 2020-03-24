package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SignInPage {
  public SignInPage(WebDriver driver) {
		super(driver);
	}

	public void navigateHome() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		String url = "https://www2.hm.com/en_us/index.html";
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String currentUrl = driver.getCurrentUrl();

		Assert.assertEquals(currentUrl, url);
	}

	public void wrongSignIn()
	{
		WebElement signIn = driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[1]"));
		signIn.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement emailTextField = driver.findElement(By.xpath("//*[@id=\"modal-txt-signin-email\"]"));
		WebElement passwordTextField = driver.findElement(By.xpath("//*[@id=\"modal-txt-signin-password\"]"));
		WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"modal-theLoginForm\"]/button"));
		
		emailTextField.sendKeys("email");
		passwordTextField.sendKeys("password");
		signInButton.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}

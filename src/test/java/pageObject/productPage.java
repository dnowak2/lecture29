package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productPage {

	//maybe pattern match on:
	//https://www2.hm.com/en_us/productpage.0699923068.html

	@FindBy(xpath = "//*[@id=\"main-content\"]/div[1]/nav/ul")
	WebElement typeOfClothing;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div[2]/div[1]/div[1]/div/section/h1")
	WebElement title;
	
	@FindBy(xpath = "//*[@id=\"js-selected-rating\"]/h3/button")
	WebElement reviews;
	
	public productPage(WebDriver driver, String url) {
		driver.get(url);
		PageFactory.initElements(driver, this);
	}
	
	public productPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

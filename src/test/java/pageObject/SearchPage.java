package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject{

	@FindBy(id="dropdown-sort")
	private WebElement sort;
	
	@FindBy(css=".product-item")
	private List<WebElement> resultProducts;

	private String url = "https://www2.hm.com/en_us/search-results.html?";
	
	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	public void search(String query) {
		url += "q=" + query;
		this.driver.get(url);
	}
	
	public void sort(String order) {
		
	}
	
	public List<String> getResultNames(){
		List<String> results = new ArrayList<String>();
		for (WebElement product : resultProducts) {
			String name = product.findElement(By.xpath("article/div[1]/a")).getAttribute("title");
			results.add(name);
		}
		
		return results;
	}
	
	public void goToResult(String name) {
		for (WebElement product : resultProducts) {
			WebElement link = product.findElement(By.xpath("article/div[1]/a"));
			if(name.equalsIgnoreCase(link.getAttribute("title"))) {
				this.driver.get(link.getAttribute("href"));
				return;
			}
		}
	}
	
	public void goToResult(int resultNumber) {
		WebElement product  = resultProducts.get(resultNumber);
		String productURL = product.findElement(By.xpath("article/div[1]/a")).getAttribute("href");
		this.driver.get(productURL);
	}
	
}

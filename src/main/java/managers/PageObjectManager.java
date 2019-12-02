package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.GooglePage;
/**
 * @author Sunil, Pandey
 * @since 07/10/2019
 */
public class PageObjectManager {

	private WebDriver driver;
	
	private GooglePage gPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public GooglePage getGooglePage() {
		return (gPage == null) ? gPage = new GooglePage(driver) : gPage;
	}

}

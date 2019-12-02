/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

/**
 * @author Sunil, Pandey
 * @since 07/10/2019
 */
public class GooglePage {

	WebDriver driver;

	public GooglePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "hplogo")
	private WebElement googleImage;

	@FindBy(how = How.XPATH, using = "//input[@title='Search']")
	private WebElement searchInput;
	
	@FindBy(how = How.NAME, using = "btnK")
	private WebElement searchButton;
	
	@FindBy(how = How.NAME, using = "btnI")
	private WebElement feelingLuckyButton;
	
	public void clickOnSearchButton() {
		searchButton.click();
	}
	
	public void clickOnFeelingLuckyButton() {
		feelingLuckyButton.click();
	}
	
	public void verifyGoogleHomePage() {
		googleImage.isDisplayed();
	}
	
	public void enterSearchValue(String value) {
		searchInput.sendKeys(value);
	}
	
	public void navigateToGoogle(){
    	driver.navigate().to(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }
}
package appfeature;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	@FindBy(xpath="//*[@class=\"nav-cart-icon nav-\"]") //sprite
	private WebElement cartButton;
	
	@FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]")
	private WebElement signInButton;
	
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	private WebElement userIdTextbox;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	private WebElement passTextBox;
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	private WebElement finalSignButton;
	
	// Constructor is used to initialize the webelements
	
	public HomePage(WebDriver driver)
	{
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   
	}
	
	public String getTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyCartIcon()
	{
		boolean isdisplay = cartButton.isDisplayed();
		return isdisplay;
	}
	
	public void signButtonClick()
	{
		Actions action=new Actions(driver);
		action.moveToElement(signInButton).perform();
		signInButton.click();
	}
	
	public void enterUsername(String uname)
	{
		userIdTextbox.sendKeys(uname);
	}
	
	public void finalSign(String pwd)
	{
		passTextBox.sendKeys(pwd);
		finalSignButton.click();
	}
	
	public void continueButtonClick()
	{
		continueButton.click();
	}
	
	
}

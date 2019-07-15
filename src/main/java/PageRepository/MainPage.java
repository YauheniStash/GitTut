package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Config.Base;

public class MainPage extends Base {

	@FindBy(id = "hplogo")
	WebElement googleLogo;

	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	

	



	public boolean getLogo() {
		boolean b = googleLogo.isDisplayed();
		return b;
	}

}

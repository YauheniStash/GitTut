package Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Config.Base;
import PageRepository.MainPage;
import junit.framework.Assert;

public class MainPageTest extends Base {

	@Test
	public void launchApp() throws IOException {
		browserInit();
	}
	@Test
	public void verifyLogo() throws IOException {
		browserInit();
		MainPage mainPage=new MainPage(driver);
		Assert.assertTrue(mainPage.getLogo());
	}
	@AfterMethod
	public void tearDown () {
		driver.quit();
	}
}

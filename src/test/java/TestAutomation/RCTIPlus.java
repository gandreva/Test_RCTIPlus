package TestAutomation;

import org.testng.annotations.Test;

import TestAutomation.pages.HomePage;
import TestAutomation.pages.LiveTVPage;

public class RCTIPlus extends BaseWebTest {
	HomePage homePage = new HomePage(driver, explicitWait);
	LiveTVPage liveTVPage = new LiveTVPage(driver, explicitWait);


	@Test(testName = "Live TV success", description = "Welcome To RCTI PLus")
	public void testAutomasi() {
	
		homePage.openLiveTV();
		liveTVPage.openTV();
		
	}
}

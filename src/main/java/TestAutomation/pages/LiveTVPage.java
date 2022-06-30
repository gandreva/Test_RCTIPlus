package TestAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LiveTVPage extends BasePage {
	By RCTI = By.xpath("//a[@class='btn btn-tab-channel btn-tab-channel-active']"); // Path TV

	public LiveTVPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void openTV() {
		clickAndWaitByXpath(RCTI);
		Utility.hardWait(3);
	}

}
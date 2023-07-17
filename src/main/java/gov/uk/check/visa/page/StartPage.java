package gov.uk.check.visa.page;

import gov.uk.check.visa.utilies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class StartPage extends Utility {
  @CacheLookup
  @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNow;

    public void clickStartNow()throws InterruptedException{
        Thread.sleep(500);
        Reporter.log("click on startNow"+startNow.toString());
        clickOnElement(startNow);

    }
}

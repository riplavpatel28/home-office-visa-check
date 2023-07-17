package gov.uk.check.visa.page;

import gov.uk.check.visa.utilies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement tourism;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue2;
    public void searchSelectReasonList(String string)throws InterruptedException{
        Thread.sleep(3000);
        clickOnElement(tourism);
    }
    public void clickOnContinue2(){
        clickOnElement(continue2);
    }
}

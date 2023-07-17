package gov.uk.check.visa.page;

import gov.uk.check.visa.utilies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    @CacheLookup
    @FindBy(xpath= "//input[@id='response-0']")
    WebElement duration;
    public void searchSelectDuration(String string){
        clickOnElement(duration);
    }
}

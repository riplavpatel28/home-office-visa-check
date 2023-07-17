package gov.uk.check.visa.page;

import gov.uk.check.visa.utilies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationality;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
    WebElement Continue;


    public void searchSelectNationality(String Dropdown){
    selectByVisibleTextFromDropDown(nationality,Dropdown);
    }
    public void clickOnContinue(){
        clickOnElement(Continue);
    }


}

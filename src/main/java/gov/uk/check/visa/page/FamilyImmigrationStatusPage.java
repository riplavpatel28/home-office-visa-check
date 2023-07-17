package gov.uk.check.visa.page;

import gov.uk.check.visa.utilies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class FamilyImmigrationStatusPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement verifyMsg;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNow;
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationality;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue;
    @FindBy(id = "response-4")
    WebElement JoinPartnerOrFamilyForALongStay;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue1;
    @FindBy(xpath = "//h2[contains(text(),'You may need a visa')]")
    WebElement getVerifyMsg;

    public String getTextFromVerifyMessage() throws InterruptedException {
        Thread.sleep(4000);
        return getTextFromElement(verifyMsg);
    }

    public void clickStartNow() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("click on startNow" + startNow.toString());
        clickOnElement(startNow);
    }

    public void searchAndSelectNationality(String Dropdown) {
        selectByVisibleTextFromDropDown(nationality, "Combia");
    }

    public void clickOnContinue() {
        clickOnElement(Continue);
    }

    public void SearchAndSelectJoinPartner() {
        clickOnElement(JoinPartnerOrFamilyForALongStay);
    }

    public void clickOnContinue1() {
        clickOnElement(Continue1);
    }

    public String getTextFromVerifyMsg() throws InterruptedException {
        Thread.sleep(4000);
        return getTextFromElement(verifyMsg);
    }
}
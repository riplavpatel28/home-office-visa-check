package gov.uk.check.visa.page;

import gov.uk.check.visa.utilies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startNow;
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationality;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue;
    @FindBy(id = "response-1")
    WebElement WorkAcademicVisitOrBusiness;
    @FindBy(id ="response-1" )
    WebElement LongerThanSixMonths;
    @FindBy(id = "response-0")
    WebElement PlanningToWork;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue1;
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement verifyMsg;

    public void clickStartNow() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("click on startNow" + startNow.toString());
        clickOnElement(startNow);
    }

    public void searchSelectNationality(String Dropdown) {
        selectByVisibleTextFromDropDown(nationality, "Chile");
    }

    public void ClickOnContinue()throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(Continue);
    }

    public void searchSelectOptionList(String string) throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(WorkAcademicVisitOrBusiness);
    }
    public void searchAndClickOn(){
        clickOnElement(LongerThanSixMonths);
    }
    public void clickOnContinue()throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(Continue);
    }
    public void searchAndSelectPlanningToWork(String string)throws InterruptedException{
        Thread.sleep(3000);
        clickOnElement(PlanningToWork);
    }
    public void clickOnContinue1(){
        clickOnElement(Continue1);
    }
    public String getTextFromVerifyMessage()throws InterruptedException{
        Thread.sleep(4000);
        return getTextFromElement(verifyMsg);
    }
}
package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customlisteners.CustomListeners;
import gov.uk.check.visa.page.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {
    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    WorkTypePage workTypePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        startPage =new StartPage();
        selectNationalityPage =new SelectNationalityPage();
        reasonForTravelPage =new ReasonForTravelPage();
        familyImmigrationStatusPage=new FamilyImmigrationStatusPage();
        workTypePage =new WorkTypePage();



    }
  @Test(groups = {"sanity","smoke","regression"})
    public void anAustralianComInToUKForTourism()throws InterruptedException{
       // Click on start button
      startPage.clickStartNow();
      //Select a Nationality 'Australia'
      selectNationalityPage.searchSelectNationality("Australia");
      //Click on Continue button
      selectNationalityPage.clickOnContinue();
      //Select reason 'Tourism'
      reasonForTravelPage.searchSelectReasonList("Tourism");
      //Click on Continue button
      reasonForTravelPage.clickOnContinue2();
      //verify result 'You will not need a visa to come to the UK'
      Assert.assertEquals(familyImmigrationStatusPage.getTextFromVerifyMessage(),"You will not need a visa to come to the UK");

  }
  @Test(groups = {"regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths()throws InterruptedException{
      // Click on start button
      Thread.sleep(300);
      workTypePage.clickStartNow();
     // Select a Nationality 'Chile'
      workTypePage.searchSelectNationality("Chile");
     // Click on Continue button
      workTypePage.ClickOnContinue();
     // Select reason 'Work, academic visit or business'
      workTypePage.searchSelectOptionList("Work, academic visit or business");
     // Click on Continue button
      workTypePage.ClickOnContinue();
     // Select intendent to stay for 'longer than 6 months'
      workTypePage.searchAndClickOn();
     // Click on Continue button
      workTypePage.clickOnContinue();
     // Select have planning to work for 'Health and care professional'
      workTypePage.searchAndSelectPlanningToWork("Health and care professional");
     // Click on Continue button
      workTypePage.clickOnContinue1();
     // verify result 'You need a visa to work in health and care'
      Assert.assertEquals(workTypePage.getTextFromVerifyMessage(),"You need a visa to work in health and care");
  }
  @Test(groups = {"sanity","regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card()throws InterruptedException{
     // Click on start button
      Thread.sleep(3000);
        familyImmigrationStatusPage.clickStartNow();
     // Select a Nationality 'Colombia'
      Thread.sleep(3000);
     // familyImmigrationStatusPage.searchAndSelectNationality("Columbia");
     // Click on Continue button
      familyImmigrationStatusPage.clickOnContinue();
     // Select reason 'Join partner or family for a long stay'
        familyImmigrationStatusPage.SearchAndSelectJoinPartner();
     // Click on Continue button
      familyImmigrationStatusPage.clickOnContinue1();
     // Select state My partner of family member have uk immigration status 'yes'
     // Click on Continue button
     // verify result 'You’ll need a visa to join your family or partner in the UK'
     // Assert.assertEquals(familyImmigrationStatusPage.getTextFromVerifyMessage(),"You may need a visa");
  }















}

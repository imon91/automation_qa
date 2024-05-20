package stepDefinition.webStepDefinition;

import core.BrowserHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.EnquirePage;
import pageObject.FormPage;
import util.ExcelReader;

import java.io.IOException;
import java.net.MalformedURLException;

public class FormSubmitStepdefs {


    public static String url ="https://staging.a-d.com.au/new-apartments-developments/vic/moonee-ponds-3039/thomas-street";

    public static WebDriver driver;
    public BrowserHandler browserHandler;
    public EnquirePage enquirePage;
    public FormPage formPage;

    @DataProvider
    public static Object[][] formDataProvider() throws IOException {
        return ExcelReader.formDataProvider();
    }

    @Given("user has been provided url")
    public void userHasBeenProvidedUrl() throws MalformedURLException {
        browserHandler = new BrowserHandler();
        String browser = System.getProperty("Browser");
        System.out.println(".............................+" + browser);
        driver = browserHandler.selectBrowser(browser,url);
        enquirePage = new EnquirePage(driver);
    }



    @When("The user fills out the form with {string}, {string}, {string}, {string},{string} , {string}, {string}, {string}, {string},{string}, {string}")
//    @Test(dataProvider = "formDataProvider")
    public void theUserFillsOutTheFormWith(String name, String email, String phone, String postCode,
                                           String describe, String priceRange, String lookingToBuy, String contactMethod,
                                           String selectPreApproval,String checkbox, String message) throws InterruptedException {

        enquirePage.clickEnquireButton();
        Thread.sleep(3000);
        formPage = new FormPage(driver);
        formPage.inputName(name);
        formPage.inputEmail(email);
        formPage.inputPhone(phone);
        formPage.inputPostCode(postCode);
        formPage.selectAudience(describe);
        formPage.selectPriceRange(priceRange);
        formPage.selectLookingToBuy(lookingToBuy);
        formPage.selectContactMethod(contactMethod);
        formPage.selectPreApproval(selectPreApproval);
        formPage.checkBoxSelect(checkbox);
        formPage.inputMessage(message);


    }


    @Then("close the browser successfully")
    public void closeTheBrowserSuccessfully() {
        driver.quit();


    }


//    public void testFormSubmission(String name, String email, String phone, String postCode,
//                                   String describe, String priceRange, String lookingToBuy, String contactMethod,
//                                   String selectPreApproval,String checkbox, String message) throws MalformedURLException, InterruptedException {
//        userHasBeenProvidedUrl();
//        theUserFillsOutTheFormWith(name, email, phone, postCode, describe, priceRange, lookingToBuy, contactMethod, selectPreApproval,checkbox, message);
//        closeTheBrowserSuccessfully();
//    }



}

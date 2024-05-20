package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class EnquirePage {
    private    WebDriver driver;

    By enquiryButton = By.xpath("//span[contains(.,'Enquire now')]");
    public EnquirePage(WebDriver driver){
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void clickEnquireButton(){
        driver.findElement(enquiryButton).click();
    }





}

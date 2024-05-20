package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FormPage {
    private    WebDriver driver;
    By name= By.xpath("   //input[@formcontrolname=\"name\"]");
    By email=By.xpath("//input[@formcontrolname=\"email\"]");
    By phone=By.xpath("//*[@id=\"phone\"]");
    By postCode=By.xpath("//input[@formcontrolname=\"postCode\"]");
    By audience=By.xpath("//select[@formcontrolname=\"audience\"]");
    By priceRange=By.xpath("//select[@formcontrolname=\"priceRange\"]");
    By lookingToBuy=By.xpath("//select[@formcontrolname=\"lookingToBuy\"]");
    By contactMethod=By.xpath("//select[@formcontrolname=\"contactMethod\"]");
    By selectPreApproval=By.xpath("('[formcontrolname=\"selectPreApproval\"]')");
    By message=By.xpath("//textarea[@formcontrolname=\"message\"]");
    By messageOption=By.xpath("//label[contains(@class, 'add-message-toggle')]");

    By inspectionCheckbox = By.xpath("//input[@formcontrolname=\"scheduleInspection\"]");
    By floorplansCheckbox = By.xpath("//input[@formcontrolname=\"requestFloorPlans\"]");
    By priceInfoCheckbox = By.xpath("//input[@formcontrolname=\"priceInformation\"]");
    By brochureCheckbox =By.xpath("//input[@formcontrolname=\"brochure\"]");




    public FormPage(WebDriver driver) {
        this.driver=driver;
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    public void inputName(String inputName){
        driver.findElement(name).sendKeys(inputName);
    }

    public void inputEmail(String inputEmail){
        driver.findElement(email).sendKeys(inputEmail);
    }

    public void inputPhone(String inputPhone){
        driver.findElement(phone).sendKeys(inputPhone);
    }

    public void inputPostCode(String inputPostCode){
        driver.findElement(postCode).sendKeys(inputPostCode);
    }

    public void selectAudience(String inputAudience){
        driver.findElement(audience).click();
        driver.findElement(By.xpath("//option[contains(.,'" + inputAudience + "')]")).click();
    }
    public void selectPriceRange(String inputPriceRange){
        driver.findElement(lookingToBuy).click();
        driver.findElement(By.xpath("//option[contains(.,'" + inputPriceRange + "')]")).click();
    }

    public void selectLookingToBuy(String inputLookingToBuy){
        driver.findElement(priceRange).click();
        driver.findElement(By.xpath("//option[contains(.,'" + inputLookingToBuy + "')]")).click();
    }

    public void selectContactMethod(String inputContactMethod){
        driver.findElement(contactMethod).click();
        driver.findElement(By.xpath("//option[contains(.,'" + inputContactMethod + "')]")).click();
    }

    public void selectPreApproval(String inputPreApproval){
        driver.findElement(contactMethod).click();
        driver.findElement(By.xpath("//option[contains(.,'" + inputPreApproval + "')]")).click();
    }

    public void checkBoxSelect(String message){
        if (message.contains("inspection"))   driver.findElement(inspectionCheckbox).click();
        if (message.contains("floorplans")) driver.findElement(floorplansCheckbox).click();
        if (message.contains("priceInfo")) driver.findElement(priceInfoCheckbox).click();
        if (message.contains("brochure")) driver.findElement(brochureCheckbox).click();

    }


    public void inputMessage(String inputMessage){
        driver.findElement(messageOption).click();
        driver.findElement(message).sendKeys(inputMessage);

    }





}

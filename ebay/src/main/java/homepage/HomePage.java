package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import report.TestLogger;

public class HomePage extends CommonAPI {

    public void clickOnSearchBar(){
typeOnElementByXpath("//input[@id='gh-ac']","Headphones");
sleepFor(5);
clickOnElementById("gh-btn");
sleepFor(5);
TestLogger.log("search bar clickable");
    }


    public void clickOnFashion(){
    clickOnElementByXpath("//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Electronics')]");
    clickOnElementByXpath("//div[contains(text(),'Portable Audio & Headphones')]");
    sleepFor(5);
    TestLogger.log("Electronics is clickable");
    }

    public void clickOnDailyDeals(){
    clickOnElementByXpath("//a[@class='gh-p'][contains(text(),'Daily Deals')]");
    clickOnElementByXpath("//span[@class='ebayui-ellipsis-3']");
    sleepFor(5);
    TestLogger.log("Spot Light is clickable");

    }

    public void clickRegister(){
    clickOnElementByXpath("//a[contains(text(),'register')]");
    sleepFor(5);
    typeOnElementById("//input[@id='firstname']","Nabeel");
    typeOnElementById("//input[@id='lastname']","Huter");
    typeOnElementById("//input[@id='email']","nabeelhuter@gmail.com");
    typeOnElementById("//input[@id='PASSWORD']","thisisnotacorrectpassword");
    clickOnElementByXpath("//button[@id='ppaFormSbtBtn']");
    sleepFor(5);
    TestLogger.log("Register option is clickable");

    }






    public void testMouseHoverFashion(){
        WebElement element = getElementByLinkText("Fashion");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkText("Watches");
        TestLogger.log("Fashion Mouse Hover");
        sleepFor(7);

    }

}

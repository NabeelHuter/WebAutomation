package pageobjectmodel;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePagePOM extends CommonAPI {
    //option1
    @FindBy(xpath = "//h2[contains(text(),'Get more value out of shopping')]")
    public static WebElement shopperToolkitValue;

    //option2
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Get more value out of shopping')]")
    public static WebElement getShopperToolkitValue2;
    @FindBy(linkText = "Shopper Toolkit")
    public static WebElement ShopperToolkit;
    WebElement shopperToolkit = getElementByLinkText("Shopper Tool");
    WebElement getShopperToolkitValue = (getElement("//h2[contains(text(),'Get more value out of shopping')]"));

    // @FindBy(xpath = "/a[contains(text(),'New Releases')]")
    // public static WebElement newReleases;
//class work
    //@FindBy (linkText = "New Releases")
    //public static newReleases;

    //@FindBy(how = How.XPATH, using = "/a[contains(text(),'New Releases')]")
    //public WebElement getGetNewReleasesValue;
    //WebElement newReleases = getElementByLinkText("New Releases");
    //WebElement getNewReleasesValue = (getElement("/a[contains(text(),'New Releases')]"));

    public void validateShopperDisplayed() {
        System.out.println(shopperToolkit.isDisplayed());
        Assert.assertEquals(shopperToolkit.isDisplayed(), true);
    }

    public void validateShopperClickAble() {
        shopperToolkit.click();
        Assert.assertEquals(getShopperToolkitValue.isDisplayed(), true);

    }
}




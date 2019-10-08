package homepagetests;

import base.CommonAPI;
import org.testng.Assert;

public class Search extends CommonAPI {

    public void searchFieldIsTypeAble() {
        //For understanding
        //boolean condition = isElementDisplayed("//input[@id='twotabsearchtextbox']");
        //Assert.assertEquals(condition,true);

        Assert.assertEquals(isElementDisplayed("//input[@id='twotabsearchtextbox']"), true);
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "Java Books");

    }


}
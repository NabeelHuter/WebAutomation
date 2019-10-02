package homepagetests;

import base.CommonAPI;
import report.TestLogger;

public class HomePage extends CommonAPI {


    public void clickOnSearchBar(){
    clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        TestLogger.log("search result panel is displayed");
    }

    public void typeOnSearchBar(String java_books){
        clickOnElementByXpath("//input[@id='twotabsearchtextbox");
        TestLogger.log("search result panel is displayed");

    }

    public void clickOnSearchButton(){
        clickOnElementByXpath("//*[@id=\"nav-search\"]/form/div[2]/div/input");

    }
}

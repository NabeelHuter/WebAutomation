package homepage;

import base.CommonAPI;
import report.TestLogger;

public class Help extends CommonAPI {

    public void clickOnHelpAndContact(){
        clickOnElementByXpath("//a[@class='gf-bttl thrd'][contains(text(),'Help & Contact')]");
        sleepFor(5);
        TestLogger.log("Help and contact is clickable");
    }
    public void clickOnSearchEbayHelp(){
        clickOnElementById("//input[@id='search_input_element']");
        typeOnElementById("//input[@id='search_input_element']","Refund");
        sleepFor(5);
        TestLogger.log("Help Search is typeable");

    }
}

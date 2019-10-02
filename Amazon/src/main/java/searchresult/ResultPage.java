package searchresult;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import report.TestLogger;
import org.testng.Assert;

public class ResultPage extends CommonAPI {
    public void validateSearchPageDisplayed(){
        WebElement element = getElement("//*[@id=\"s-refinements\"]");
        Assert.assertEquals(element.isDisplayed(),true);
        TestLogger.log("search result panel is displayed : "+element.isDisplayed());
    }
}

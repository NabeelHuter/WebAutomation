package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import report.TestLogger;

public class MouseHover extends CommonAPI {


    @Test(enabled = false)
    public void testMouseHoverFashion() {
        WebElement element = getElementByLinkText("Fashion");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkText("Watches");
        TestLogger.log("Fashion Mouse Hover");
        sleepFor(7);
    }
}

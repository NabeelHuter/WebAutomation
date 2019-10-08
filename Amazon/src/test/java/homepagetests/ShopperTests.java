package homepagetests;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjectmodel.HomePagePOM;

public class ShopperTests extends CommonAPI {
    @Test
    public void testShoppeToolkit() {
        HomePagePOM homePagePOM = PageFactory.initElements(driver, HomePagePOM.class);
        homePagePOM.validateShopperDisplayed();
        homePagePOM.validateShopperClickAble();
    }
}

package homepagetest;

import homepage.HomePage;
import org.testng.annotations.Test;

public class HomePageTest extends HomePage {

    @Test
    public void clickOnSearchBar() {
        super.clickOnSearchBar();
    }

    @Test
    public void clickOnFashion(){
        super.clickOnFashion();
    }

    @Test
    public void clickOnDailyDeals(){
        super.clickOnDailyDeals();
    }

    @Test
    public void clickRegister(){
        super.clickRegister();
    }

    @Test
    public void testMouseHoverFashion(){
        super.testMouseHoverFashion();
    }
}

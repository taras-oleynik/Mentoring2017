package tests;


import org.junit.Test;
import pages.HomePage;

/**
 * Created by Taras_Oliinyk on 10/27/2017.
 */
public class HomePageTest extends BaseTest {

HomePage homePage = new HomePage();

    @Test
    public void contactUs(){

        homePage.clickOnElement();
    }

}

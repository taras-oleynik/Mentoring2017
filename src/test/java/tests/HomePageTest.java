package tests;


import org.junit.Test;
import pages.HomePage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by Taras_Oliinyk on 10/27/2017.
 */
public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();

    private boolean isVisible() {
        return true;
    }


    // @Test
    //  public void contactUs(){


    // homePage.clickOnContactUsLink();

    // assertTrue("not match",homePage.isContactVisiable());
//
    //  }

    @Test
    public void registrationTest() {
        homePage.clickOnRegistration();
        boolean emailIsPresent = homePage.isFieldEmailPrsent();
        assertTrue("fild email not found", emailIsPresent);


    }

    @Test
    public void titleCheck() {

        String pageTitle = homePage.isTitleIsCorrect();
        assertEquals("⋆ modnaKasta ⋆ Интернет-магазин одежды и обуви ⋆ Недорогая брендовая одежда в Украине: Киев, Одесса, Харьков ‣ Доставка по Украине!", pageTitle);
    }

}

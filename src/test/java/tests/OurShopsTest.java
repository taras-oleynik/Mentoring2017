package tests;

import org.junit.Test;
import pages.OurShops;


public class OurShopsTest extends BaseTest {

    OurShops ourShops = new OurShops();

    @Test
    public void shopsTest (){

        ourShops.clickOnOurShops();
    }


}

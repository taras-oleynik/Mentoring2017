package tests;

import org.junit.*;
import pages.BasePage;



public class BaseTest {



    BasePage basePage = new BasePage();

    @Before
    public  void startPageTest(){


        basePage.openHomePage();
    }


    @Test
    public void testRun(){}


    @After

    public  void closeHomePageTest(){

        basePage.closeHomePage();
    }


}

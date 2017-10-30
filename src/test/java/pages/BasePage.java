package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasePage {

    WebDriver driver = new FirefoxDriver();


    public void openHomePage(){


        driver.get("https://modnakasta.ua/");

    }

    public void closeHomePage(){

        driver.quit();
    }
}

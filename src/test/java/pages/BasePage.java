package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import static pages.WebDriverCreator.getDriver;


public class BasePage {

    WebDriver driver = getDriver();

    public void BasePage(){
        PageFactory.initElements(driver,this);
    }

    public void openHomePage(){
        driver.get("https://modnakasta.ua/");
    }

    public void closeHomePage(){
        driver.quit();
    }
}

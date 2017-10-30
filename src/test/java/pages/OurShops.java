package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import tests.OurShopsTest;


public class OurShops extends OurShopsTest {


    WebDriver driver = new FirefoxDriver();

    public void clickOnOurShops() {

        WebElement element = driver.findElement(By.xpath("//*[@id='up']/div[1]/div/div[2]/a[2]"));
        element.click();
    }
}
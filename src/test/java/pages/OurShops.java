package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class OurShops extends BasePage {



    public void clickOnOurShops() {

        WebElement element = driver.findElement(By.xpath("//*[@id='up']/div[1]/div/div[2]/a[2]"));
        element.click();
    }
}
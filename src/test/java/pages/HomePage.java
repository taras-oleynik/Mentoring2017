package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class HomePage extends BasePage{


    public void clickOnElement(){

        WebElement element = driver.findElement(By.xpath("//*[@id='footer']/div[1]/div[2]/div[1]/ul/li[1]/a"));
        element.click();
    }
}

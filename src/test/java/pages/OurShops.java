package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OurShops extends BasePage {

@FindBy(xpath = "//*[@id=\"up\"]/div[1]/div/div[2]/a[2]")
private WebElement shopsButton;
@FindBy(css="h1")
private WebElement textH1;



    public void clickOnOurShops() {


        shopsButton.click();
    }
}
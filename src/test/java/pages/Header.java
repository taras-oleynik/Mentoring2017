package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Taras_Oliinyk on 11/16/2017.
 */
public class Header  extends BasePage {

    @FindBy(css = "a[href*='krasota']")
    private WebElement beauty;


    public StaylingPage clickOnBeauty(){

        beauty.click();

        return new StaylingPage();
    }
}

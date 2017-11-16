package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
    @FindBy(css = "a[href*='contacts']")
    private WebElement contactUsLink;

    //@FindBy(css = ".mk-flat_title")
    //private WebElement concTitle;

    @FindBy(css=".header-top_login")
    private WebElement registrButton;
    @FindBy(xpath = "//*[@id='username']")
    private WebElement emailFiels;

    public void clickOnRegistration() {
        registrButton.click();
    }

   // public boolean isContactVisiable() {
    //    return concTitle.isDisplayed();

   // }

    public void clickOnContactUsLink() {

        contactUsLink.click();

    }
    public String isTitleIsCorrect(){
        return driver.getTitle();
    }

    public boolean isFieldEmailPrsent() {
        return emailFiels.isDisplayed();
    }


//    public void getMenuItem(String menu, String number) {
//        driver.findElement(By.xpath("//div[@class='new-menu-w-item ']//a[text()= '"+ menu +"']"));
//        driver.findElement(By.xpath("(//li[@class='footer_list_item'])["+number+"]"));
//
//    }
}

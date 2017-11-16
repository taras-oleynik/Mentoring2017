package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Taras_Oliinyk on 11/9/2017.
 */
public class RegistrationPage extends BasePage {

    @FindBy(css = ".input.text")
    private WebElement newUserLogin;

    @FindBy(css = "#new-password")
    private WebElement newUserPass;

    @FindBy(css = ".reg")
    private WebElement singUpButton;

    @FindBy(css = ".popup__recovery-email-text")
    private WebElement reText;


    @FindBy(css = "div input[type]")

    private List<WebElement> inputElements;




    public WebElement getElementFromList(String text) {
        for (WebElement element : inputElements) {

            if (element.getText().contains(text)) {

                return element;
            }
            return null;
        }


//        for (int i = 0; i < inputElements.size(); i++) {
//
//            String inputTest = inputElements.get(i).getText();
//
//            if (inputTest.equals("Зарегистрироваться")) {
//
//                return inputTest;
//            }
//        }
        return null;
    }


    public void singUp() {

        newUserLogin.sendKeys("junius.koepp@0box.eu");
        newUserPass.sendKeys("qwerty123");
        singUpButton.click();

    }

    public String getRegText() {

        return reText.getText();

    }
}

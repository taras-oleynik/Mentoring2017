package tests;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.RegistrationPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Taras_Oliinyk on 11/9/2017.
 */
public class RegistrationPageTest extends BaseTest{
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void
     checkReult(){

        registrationPage.getElementFromList("");
    }

    @Test
    public void getSucssefullText (){
        registrationPage.singUp();

       String registrationText= registrationPage.getRegText();
        assertEquals("Сообщение со ссылкой для регистрации отправлено на ваш электронный адрес. Вы должны получить его в ближайшее вр",registrationText);

    }

    @Test
    public void getInputTest(){

       WebElement inputText = registrationPage.getElementFromList("Зарегистрироваться");
        WebElement inputText1 = registrationPage.getElementFromList("Вход");
        WebElement inputText2 = registrationPage.getElementFromList("Выход");
       assertNotNull(inputText);
        assertEquals("Зарегистрироваться",inputText.getText());
    }
}

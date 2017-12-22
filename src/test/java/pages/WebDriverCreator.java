package pages;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverCreator {
    protected static WebDriver driver;

    private static String browserType = "chrome";


    public static WebDriver getDriver() {
        if (driver == null) {
            switch (browserType) {
                case "chrome":
                    //System.setProperty("webdriver.chrome.driver", "D:\\Taras\\automation\\driver\\chromedriver.exe");
                    ChromeDriverManager.getInstance().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;
            }
        }
        return driver;
    }
}

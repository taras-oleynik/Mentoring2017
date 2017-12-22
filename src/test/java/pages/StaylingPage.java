package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

/**
 * Created by Taras_Oliinyk on 11/17/2017.
 */
public class StaylingPage extends BasePage {

    @FindBy(css = ".product__item")
    private List<WebElement> allProductsOnPageStyling;
    private List<WebElement> sortedProducs;

    public List<WebElement> filterProductByPrice(int filterValue) {

        for (WebElement element : allProductsOnPageStyling) {
            double price = extractPrice(element);
            if (price >= filterValue) {

                sortedProducs.add(element);
            }

        }
        return sortedProducs;
    }

    public WebElement minPriceValue(List<WebElement> list) {
        WebElement minValueElement = null;
        double minPrice = extractPrice(list.get(0));
        for(int i=1;i<list.size();i++){
            if(extractPrice(list.get(i)) < minPrice){
                minPrice = extractPrice(list.get(i));
                minValueElement = list.get(i);
            }
        }
        return minValueElement;
    }
    public void clickonMinElem(){
        minPriceValue(filterProductByPrice(300)).click();
    }


 /*   public void clickby(){
        clickon(sortedProducs);
    }*/

    public void displayMinVAlue(){
       System.out.println(minPriceValue(filterProductByPrice(500)));
    }

    private double extractPrice(WebElement element) {
        WebElement priceElement = element.findElement(By.cssSelector(".product_item__new-cost"));


        return Double.parseDouble(priceElement.getText().replaceAll(" грн", ""));
    }


}

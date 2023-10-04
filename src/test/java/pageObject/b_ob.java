package pageObject;

import base.Config;
import org.openqa.selenium.By;


public class b_ob extends Config {

    public void openWalmartPage(){
        driver.get("https://www.walmart.com");
    }
    public void searchForShoes(String keyword){
        driver.findElement(By.name("q")).sendKeys(keyword);
        driver.findElement(By.cssSelector(".header-GlobalSearch-submit.btn")).click();
    }
    public void clickOnShoeProduct(String productName) {
        driver.findElement(By.linkText(productName)).click();
    }
    public void addToCart() {
        driver.findElement(By.cssSelector(".prod-product-cta-add-to-cart-1")).click();
    }
    public void goToCart() {
        driver.findElement(By.cssSelector(".cart-pos-right")).click();
    }


    }
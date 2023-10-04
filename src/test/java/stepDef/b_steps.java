package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.b_ob;

public class b_steps extends Config {

    b_ob b = new b_ob();
    @Given("I am on the Walmart website")
    public void iAmOnTheWalmartWebsite() {
        b.openWalmartPage();
        //verify the home page
        String exp ="Walmart Homepage";
        String act = driver.getTitle();
        Assert.assertEquals(act, exp);

    }

    @When("I search for {string}")
    public void iSearchFor(String keyword) {
        b.searchForShoes(keyword);
    }

    @And("I click on the product {string}")
    public void iClickOnTheProduct(String productName) {
        b.clickOnShoeProduct(productName);
    }

    @And("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        b.addToCart();
    }

    @Then("the product should be in the cart")
    public void theProductShouldBeInTheCart() {
        b.goToCart();
    }
}

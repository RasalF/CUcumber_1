package stepDef;

import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

public class Hook extends Config {


    public static String envType = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    public static String baseURL;

    @Before
    public void startTest(){
        driver = setupBrowser(browserType);
        switch (envType) {

            case "qa":
                baseURL= "https://www.walmart.com";
                break;
            case "stage":
                baseURL = "https://www.stage.taltektc.com";
                break;
        }
        driver.get(baseURL);
    }
    @After
    public void afterTest(){
        driver.close();


    }


}
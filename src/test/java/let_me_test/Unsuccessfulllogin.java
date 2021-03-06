package let_me_test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import webtest_komoot.base;
import webtest_komoot.page_object.Landingpage;
import webtest_komoot.page_object.Loginpage;

public class Unsuccessfulllogin extends base {

    public WebDriver driver;
    @BeforeTest
    public void initialize() throws IOException
    {

        driver =initializeDriver();

    }


    // negative testcase
    @Test
    public void Unsuccessful_login()
    {
        // Navigating to a webpage
        driver.get(prop.getProperty("url"));
        // creating object of landing_page class
        Landingpage l = new Landingpage(driver);
        // accessing methods from Landing_page
        l.ge_accept_cookie().click();
        // creating object of Login_page
        Loginpage lp = l.getLogin();
        // accessing getemail() methods from Landing_page and sending keys and can also be done via data properties
        lp.getEmail().sendKeys("qazimujahid3@gmail.com");
        lp.getLogin().click();
        lp.getPassword().sendKeys("Muji412789");
        lp.getLogin_button().click();

//        System.out.println(driver.findElement(By.cssSelector("div[class='css-12vwrvz'] p[class='css-2xr4dc']")).getText());
        Assert.assertTrue(driver.findElement(By.cssSelector("div[class='css-12vwrvz'] p[class='css-2xr4dc']")).isDisplayed());

    }

    @AfterTest
    public void teardown()
    {

        driver.close();

    }


}



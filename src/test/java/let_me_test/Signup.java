package let_me_test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webtest_komoot.base;
import webtest_komoot.page_object.Landingpage;
import webtest_komoot.page_object.Loginpage;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Signup extends base {

    public WebDriver driver;


    @BeforeTest
    public void initialize() throws IOException
    {

        driver =initializeDriver();

    }
    @Test
    public void Successfulsignup()
    {
        // Navigating to a webpage
        driver.get(prop.getProperty("url"));
        // creating object of Landing_page
        Landingpage l = new Landingpage(driver);
        // accessing methods
        l.ge_accept_cookie().click();
        // creating object of Login_page
        Loginpage lp = l.getLogin();
        lp.getEmail().sendKeys("qazifghkk@gmail.com");
        lp.getLogin().click();
        lp.getusername().sendKeys("Seven_senders_1");
        lp.getPassword().sendKeys("seven5671");
        lp.getLogin_button().click();

    }
    @AfterTest
    public void teardown()
    {

        driver.close();

    }

}

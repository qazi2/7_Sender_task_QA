package let_me_test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import webtest_komoot.page_object.Landing_page;
import webtest_komoot.page_object.Login_page;
import java.util.concurrent.TimeUnit;

public class Signup {
    @Test
    public void Successful_Sign_up()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://komoot.com");
        //using Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // creating object of Landing_page
        Landing_page l = new Landing_page(driver);
        // accessing methods
        l.ge_accept_cookie().click();
        // creating object of Login_page
        Login_page lp = l.getLogin();
        lp.getEmail().sendKeys("qazifghkk@gmail.com");
        lp.getLogin().click();
        lp.getusername().sendKeys("Seven_senders_1");
        lp.getPassword().sendKeys("seven5671");
        lp.getLogin_button().click();
        // closes current browser
        driver.close();

    }

}

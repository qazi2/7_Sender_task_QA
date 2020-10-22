package let_me_test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import webtest_komoot.page_object.Landing_page;
import webtest_komoot.page_object.Login_page;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login_test_cases {


    @Test
    public void Successful_login()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://komoot.com");
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Landing_page l = new Landing_page(driver);
        l.ge_accept_cookie().click();
        Login_page lp = l.getLogin();
        lp.getEmail().sendKeys("qazimujahid3@gmail.com");
        lp.getLogin().click();
        lp.getPassword().sendKeys("Muji456789");
        lp.getLogin_button().click();
    }

    @Test
    public void Unsuccessful_login()
    {

        System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://komoot.com");
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Landing_page l = new Landing_page(driver);
        l.ge_accept_cookie().click();
        Login_page lp = l.getLogin();
        lp.getEmail().sendKeys("qazimujahid3@gmail.com");
        lp.getLogin().click();
        lp.getPassword().sendKeys("Muji412789");
        lp.getLogin_button().click();

    }

}

package let_me_test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import webtest_komoot.page_object.Landing_page;
import webtest_komoot.page_object.Login_page;


public class Login_test_cases {
    // positive testcase
    // pre requisite: Registered customer account
    @Test
    public void Successful_login()
    {
        // chrome driver instance
        System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Navigating to a webpage
        driver.get("https://komoot.com");
        // applying Implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // creating object of landing_page class
        Landing_page l = new Landing_page(driver);
        // accessing methods from Landing_page
        l.ge_accept_cookie().click();
        // creating object of Login_page class
        Login_page lp = l.getLogin();
        // accessing getemail() methods from Landing_page and sending keys and can also be done via data properties
        lp.getEmail().sendKeys("qazimujahid3@gmail.com");
        lp.getLogin().click();
        // accessing methods from Landing_page
        lp.getPassword().sendKeys("Muji456789");
        // clicking on login button
        lp.getLogin_button().click();
        System.out.println(driver.getCurrentUrl());
        // using explicit wait because it may take more time from usuall
        WebDriverWait w = new WebDriverWait (driver ,10);
        // w is the object of the class and we can access the method by using the object
        w.until(ExpectedConditions.urlContains("https://www.komoot.com/discover"));
        // Validating successful login
        Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://www.komoot.com/discover"));
        // closing the current browser
        driver.close();
    }

// negative testcase
    @Test
    public void Unsuccessful_login()
    {
        // chrome driver instance
        System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Navigating to a webpage
        driver.get("https://komoot.com");
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // creating object of landing_page class
        Landing_page l = new Landing_page(driver);
        // accessing methods from Landing_page
        l.ge_accept_cookie().click();
        // creating object of Login_page
        Login_page lp = l.getLogin();
        // accessing getemail() methods from Landing_page and sending keys and can also be done via data properties
        lp.getEmail().sendKeys("qazimujahid3@gmail.com");
        lp.getLogin().click();
        lp.getPassword().sendKeys("Muji412789");
        lp.getLogin_button().click();
        // validating that customer is not able to login with wrong password
        Assert.assertTrue(driver.findElement(By.cssSelector("[class ='css-12vwrvz']")).getText().equalsIgnoreCase("Unfortunately we couldn’t log you in. Please verify your email and password and try again."));
        // closing the current browser
        driver.close();
    }



}

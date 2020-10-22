package let_me_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class komoot_landing_page

{
    @Test
    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://komoot.com");
        String expectedTitle = "Komoot | Everything You Need To Explore More of the Great Outdoors";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle, "Titel matches to website title");
        System.out.println(driver.getTitle());
    }

}



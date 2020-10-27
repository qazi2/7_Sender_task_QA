package let_me_test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webtest_komoot.base;
import java.io.IOException;

public class komoot_landing_page extends base{

    public WebDriver driver;

    @BeforeTest
    public void initialize() throws IOException
    {

        driver =initializeDriver();

    }

    @Test
    public void setDriver() throws IOException  {
        driver.get(prop.getProperty("url"));
        String expectedTitle = "Komoot | Everything You Need To Explore More of the Great Outdoors";
        String originalTitle = driver.getTitle();
        // Validating title of webpage
        Assert.assertEquals(originalTitle, expectedTitle, "Titel matches to website title");
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void teardown ()
    {

        driver.close();


    }


}



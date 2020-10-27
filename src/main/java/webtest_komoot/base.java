package webtest_komoot;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {

    public static  WebDriver driver;
    public Properties prop;
    public WebDriver initializeDriver() throws IOException
    {

        prop= new Properties();
        //System.getProperty("user.dir")
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/data.properties");

        prop.load(fis);
//mvn test -Dbrowser=chrome

//String browserName=System.getProperty("browser");  // Uncomment this line if you are sending parameter from Maven
        String browserName=prop.getProperty("browser");// comment this line if you are sending parameter from Maven
        System.out.println(browserName);

        if(browserName.contains("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
            ChromeOptions options =new ChromeOptions();
            if(browserName.contains("headless"))
            {
                options.addArguments("headless");
            }
            driver= new ChromeDriver(options);
            //execute in chrome driver

        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

}

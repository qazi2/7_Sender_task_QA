package let_me_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webtest_komoot.base;
import webtest_komoot.page_object.Landing_page;
import webtest_komoot.page_object.Page_links;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


    public class Page_link_bottom  extends base {

        public WebDriver driver;

        @BeforeTest
        public void initialize() throws IOException
        {

            driver =initializeDriver();

        }


        @Test
        public void Page_link_validation_bottom_links()
        {
            // Navigating to a webpage
            driver.get(prop.getProperty("url"));
            //Implicit wait
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Landing_page l = new Landing_page(driver);
            l.ge_accept_cookie().click();

            Page_links p = new Page_links(driver);
            System.out.println(p.size_footer().getSize());

            WebElement coloumndriver=p.footerdriver().findElement(By.xpath("//*[@id='footer']/section/div"));
            System.out.println(coloumndriver.findElements(By.tagName("a")).size());

            // clicks on each link in the coloumn and check if the pages are opening-
            for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
            {

                String clickonlinkTab= Keys.chord(Keys.COMMAND,Keys.ENTER);

                coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

            }
            // opens all the tabs
            Set<String> abc=driver.getWindowHandles();//4
            Iterator<String> it=abc.iterator();
            // coming back to all tabs and capturing the title of page
            while(it.hasNext())
            {

                driver.switchTo().window(it.next());
                System.out.println(driver.getTitle());

            }

        }


        @AfterTest
        public void teardown()
        {

            driver.close();

        }

    }
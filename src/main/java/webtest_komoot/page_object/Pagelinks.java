package webtest_komoot.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pagelinks {

    private By footer_size=By.tagName("a");
    private By footer_driver= By.id("footer");

        public WebDriver driver;


        public Pagelinks(WebDriver driver) {
            // TODO Auto-generated constructor stub

            this.driver=driver;

        }

        public WebElement footerdriver()
       {
        return driver.findElement(footer_driver);
       }

        public WebElement size_footer()
        {
            return driver.findElement(footer_size);
        }




    }




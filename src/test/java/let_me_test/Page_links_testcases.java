package let_me_test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import webtest_komoot.page_object.Landing_page;
import webtest_komoot.page_object.Page_links;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Page_links_testcases {

    @Test
    public void Page_link_validation_bottom_links()
    {
        // creating webdriver instance
        System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://komoot.com");
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
        // closing the current browser
        driver.close();

    }


    @Test
    public void Page_link_validation_Top_links()
    {
        // creating webdriver instance

		System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();

		driver.get("http://komoot.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='gdpr_banner_portal']/div/div/div/div/div[2]/div/div[1]/button/div/div")).click();

        Page_links p = new Page_links(driver);
        System.out.println(p.size_footer().getSize());
        WebElement coloumndriver=p.footerdriver().findElement(By.xpath("//*[@id=\'pageMountNode']/div/div[1]/div/div/div[1]"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

        // clicks on each link in the coloumn and check if the pages are opening-
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
    {

        String clickonlinkTab=Keys.chord(Keys.COMMAND,Keys.ENTER);

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
		// closing the current browser
        driver.close();

}

}



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


    //one is inheritance

//            // creating object to that class and invoke methods of it
//            driver.get(prop.getProperty("url"));
//            Landing_page l=new Landing_page(driver);
//            Login_page lp=l.getLogin(); //driver.findElement(By.css()
//            lp.getEmail().sendKeys(Username);
//            lp.getPassword().sendKeys(Password);
//
////            log.info(text);
//
//            lp.getLogin().click();
//            Forgot_Password fp= lp.forgotPassword();
//            fp.getEmail().sendKeys("xxx");
//            fp.Send_New_Password().click();
//
//
//
//        }
//
//        @AfterTest
//        public void teardown()
//        {
//
//            driver.close();
//
//
//        }
//
//
//        @DataProvider
//        public Object[][] getData()
//        {
//            // Row stands for how many different data types test should run
//            //coloumn stands for how many values per each test
//
//            // Array size is 2
//            // 0,1
//            Object[][] data=new Object[2][3];
//            //0th row
//            data[0][0]="nonrestricteduser@qw.com";
//            data[0][1]="123456";
//            data[0][2]="Restrcited User";
//            //1st row
//            data[1][0]="restricteduser@qw.com";
//            data[1][1]="456788";
//            data[1][2]= "Non restricted user";
//
//            return data;
//
//
//
//        }

}



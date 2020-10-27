package webtest_komoot.page_object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Landingpage {

    public  WebDriver driver;

    private By sign_up_login=By.cssSelector("[class='tw-inline-flex tw-justify-center tw-items-center c-btn c-btn--primary-inv']");
    private By title=By.xpath("//*[@id=pageMountNode]/div/div[2]/div/main/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div[1]/h3");
    private By cookie_Accept = By.xpath("//*[@id='gdpr_banner_portal']/div/div/div/div/div[2]/div/div[1]/button/div/div");




    public Landingpage(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }

    public Loginpage getLogin() {
        driver.findElement(sign_up_login).click();
        Loginpage lp = new Loginpage(driver);
        return lp;
    }

    public WebElement ge_accept_cookie()
    {

        return driver.findElement(cookie_Accept);
    }


    public WebElement getTitle()
    {
        return driver.findElement(title);
    }



}




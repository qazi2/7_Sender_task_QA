package webtest_komoot.page_object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgot_Password {


    public WebDriver driver;

    private By email=By.xpath("//*[@id='email']");
    private By Send_New_Password=By.xpath("//*[@id='pageMountNode']/div/div/div[1]/div/div/div[2]/form/div/div[3]/div/div[1]/button/div/div");



    public Forgot_Password(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }


    public WebElement getEmail()
    {
        return driver.findElement(email);
    }

    public WebElement Send_New_Password()
    {
        return driver.findElement(Send_New_Password);
    }



}

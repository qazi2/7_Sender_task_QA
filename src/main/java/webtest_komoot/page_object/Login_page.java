package webtest_komoot.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page {
    public WebDriver driver;

    private By email=By.cssSelector("[id='email']");
    private By password=By.cssSelector("[id='password']");
    private By c_w_email=By.cssSelector("[type='submit']"); // continue with email button
    private By forgotPassword = By.cssSelector("[class='css-19qpw5e']");
    private By Login_button = By.cssSelector("[class='css-1how7p2']");

    public Login_page(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }


    public Forgot_Password forgotPassword()
    {
        driver.findElement(forgotPassword).click();
        return new Forgot_Password(driver);

    }
    public WebElement getEmail()
    {
        return driver.findElement(email);
    }


    public WebElement getPassword()
    {
        return driver.findElement(password);
    }

    public WebElement getLogin()
    {
        return driver.findElement(c_w_email);
    }

    public WebElement getLogin_button()
    {
        return driver.findElement(Login_button);
    }










}

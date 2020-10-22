package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_komoot {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/qazi/Documents/selenium-java-3.141.59/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://komoot.com");
        String PageTitle = driver.getTitle();
        System.out.println("Page Title is:" + PageTitle);
        driver.close();
    }
}
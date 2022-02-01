package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PageElements {

    public static void main(String[] args) {
        //        System.setProperty("webdriver.chrome.driver", "./drivers/driver.exe");
        WebDriverManager.chromedriver().setup();


        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.google.com/");
        WebElement searchBox = chromeDriver.findElement(By.name("q"));
        searchBox.sendKeys("Automation Step by Step", Keys.ENTER);

        chromeDriver.navigate().to("https://trytestingthis.netlify.app/");
        List<WebElement> options = chromeDriver.findElements(By.name("Optionwithcheck[]"));
        for (WebElement item : options) {
            System.out.println(item.getText());
        }
        chromeDriver.findElement(By.cssSelector("input#fname"));
        chromeDriver.navigate().to("https://www.orangehrm.com/");
//        WebElement webElement = chromeDriver.findElement(By.cssSelector("input#lnam"));


//        String title = chromeDriver.getTitle();
//        System.out.println("Page title is = " + title);
//        WebElement element = chromeDriver.findElement(By.xpath("//input[@name='emailid']"));
//        element.sendKeys("abc@gmail.com");
//
//        WebElement button = chromeDriver.findElement(By.xpath("//input[@name='btnLogin']"));
//        button.click();
        chromeDriver.close();
        chromeDriver.quit();
    }
}

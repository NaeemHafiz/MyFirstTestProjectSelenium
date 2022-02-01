package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitClass {


    public static void main(String[] args) {
        //        System.setProperty("webdriver.chrome.driver", "./drivers/driver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        chromeDriver.get("https://www.google.com/");
        chromeDriver.findElement(By.name("q")).sendKeys("Automation step by step" + Keys.ENTER);

        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, 10);
        WebElement myLink = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Automation Step by Step: Never Stop Learning ...")));
        myLink.click();

        chromeDriver.close();
        chromeDriver.quit();
    }

}

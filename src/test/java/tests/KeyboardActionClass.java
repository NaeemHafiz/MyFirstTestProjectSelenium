package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionClass {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();

        /*
        //Send keys
        chromeDriver.get("https://google.com");
        chromeDriver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
         */

        /*
        //Key down
        chromeDriver.get("https://google.com");
        chromeDriver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
        Actions actionProvider = new Actions(chromeDriver);
        Action keydown = actionProvider.keyDown(Keys.CONTROL).sendKeys("a").build();
        keydown.perform();
         */

        //Key up
        chromeDriver.get("https://google.com");
        chromeDriver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);

        Actions action = new Actions(chromeDriver);
        WebElement searhBox = chromeDriver.findElement(By.name("q"));
        action.keyDown(Keys.SHIFT).sendKeys(searhBox, "selenium").keyUp(Keys.SHIFT).sendKeys("   selenium").perform();
        Thread.sleep(2000);
        searhBox.clear();

        Thread.sleep(2000);
        chromeDriver.quit();
    }
}

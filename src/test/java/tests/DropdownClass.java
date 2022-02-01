package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownClass {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.get("https://trytestingthis.netlify.app/");
        WebElement dropdwon = chromeDriver.findElement(By.id("owc"));
        Select selectObject = new Select(dropdwon);
        /*
        select.selectByIndex(0);
        Thread.sleep(1000);
        select.selectByValue("option 2");
        Thread.sleep(1000);
        select.selectByVisibleText("Option 3");
         */

        List<WebElement> allAvailableOptions = selectObject.getOptions();
        System.out.println("------------------------" + " " + allAvailableOptions.size());


        //OR
//        List<WebElement> allAvailableOptions = chromeDriver.findElements(By.id("option"));

        for (WebElement item : allAvailableOptions) {
            System.out.println(item.getText());
            if (item.getText().equalsIgnoreCase("option 3")) {
                item.click();
                Thread.sleep(2000);
                System.out.println("Option 3 Clicked");
            }
        }

        Thread.sleep(5000);

        chromeDriver.quit();
        System.out.println("Done");


    }
}

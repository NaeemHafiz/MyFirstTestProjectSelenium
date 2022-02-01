package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AlertClass {

    public static void main(String[] args) {
        //        System.setProperty("webdriver.chrome.driver", "./drivers/driver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //Js Alert
        chromeDriver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Alert alert = chromeDriver.switchTo().alert();
        System.out.println(alert.getText());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert.accept();
        if (chromeDriver.getPageSource().contains("You successfully clicked an alert"))
            System.out.println("You successfully clicked an alert");
        System.out.println("-----------------------");

        //Js Confirm
        chromeDriver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Alert alert1 = chromeDriver.switchTo().alert();
        System.out.println(alert1.getText());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert1.dismiss();

        if (chromeDriver.getPageSource().contains("You clicked: Cancel"))
            System.out.println("You clicked: Cancel");
        System.out.println("-----------------------");

        //Js Prompt
        chromeDriver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert alert2 = chromeDriver.switchTo().alert();
        alert2.sendKeys("Automation step by step");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert2.accept();

        if (chromeDriver.getPageSource().contains("You entered: Automation step by step"))
            System.out.println("You entered: Automation step by step");
        System.out.println("-----------------------");

        chromeDriver.close();
        chromeDriver.quit();
    }
}

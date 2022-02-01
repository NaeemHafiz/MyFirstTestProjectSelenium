package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    private static WebElement webElement = null;

    public static WebElement textbox_search(WebDriver driver) {
        webElement = driver.findElement(By.name("q"));
        return webElement;
    }
    public static WebElement button_search(WebDriver driver) {
        webElement = driver.findElement(By.name("btnK"));
        return webElement;
    }
}

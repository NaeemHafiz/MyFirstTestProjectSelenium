package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPageObjects {

    WebDriver webDriver = null;

    By textbox_search = By.name("q");
    By button_search = By.name("btnK");

    public GoogleSearchPageObjects(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void setTextInSearhcbox(String text) {
        webDriver.findElement(textbox_search).sendKeys(text);
    }

    public void clickSearhcbutton() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(textbox_search)));
        wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(textbox_search))).sendKeys(Keys.RETURN);
//        webDriver.findElement(button_search).sendKeys(Keys.RETURN);
    }
}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObjects;

public class GoogleSearhPageObjectsTest {
    private static WebDriver webDriver = null;

    public static void main(String[] args) {
        googleSearchTest();

    }

    public static void googleSearchTest() {
        System.setProperty("webdriver.chrome.driver", "./drivers/driver.exe");
        webDriver = new ChromeDriver();
        GoogleSearchPageObjects googleSearchPageObjects = new GoogleSearchPageObjects(webDriver);
        webDriver.get("https://google.com");
        googleSearchPageObjects.setTextInSearhcbox("A B C D");
        googleSearchPageObjects.clickSearhcbutton();
        System.out.println("Test Completed Successfully");

        webDriver.close();


    }
}

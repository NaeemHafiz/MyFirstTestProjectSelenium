package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageObjectTestNG {

    private WebDriver webDriver = null;

    @BeforeTest
    public void setupTestMethod() {
        System.setProperty("webdriver.chrome.driver", "./drivers/driver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
    }

    @Test
    public void googleSearchTestMethod() {

        GoogleSearchPageObjects googleSearchPageObjects = new GoogleSearchPageObjects(webDriver);
        googleSearchPageObjects.setTextInSearhcbox("A B C D");
        googleSearchPageObjects.clickSearhcbutton();
    }

    @AfterTest
    public void teardownMethodTest() {
        webDriver.close();
        webDriver.quit();
        System.out.println("Test Completed Successfully");

    }
}

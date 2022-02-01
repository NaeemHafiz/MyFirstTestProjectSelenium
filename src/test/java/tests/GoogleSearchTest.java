package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearch();
    }

    public static void googleSearch() {
        System.setProperty("webdriver.chrome.driver", "./drivers/driver.exe");
        driver = new ChromeDriver();
        GoogleSearchPage.textbox_search(driver).sendKeys("Autoamation step by step");
        GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);

        System.out.println("Test Completed Successfully");
    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Browser {

    public static void main(String[] args) throws InterruptedException, IOException {
//        System.setProperty("webdriver.chrome.driver", "./drivers/driver.exe");
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");
//        String origionalWindow = driver.getWindowHandle();
//        driver.navigate().to("https://automationstepbystep.com");
//
//        System.out.println("Current Url is=" + driver.getCurrentUrl());
//        System.out.println("Page title is = " + driver.getTitle());
//
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(8000);
//        driver.switchTo().window(origionalWindow);
//        Thread.sleep(2000);
//        driver.switchTo().newWindow(SafariDriver.WindowType.WINDOW);
//        driver.switchTo().newWindow(SafariDriver.WindowType.TAB);

//        int width = driver.manage().window().getSize().width;
//        int height = driver.manage().window().getSize().height;
//        Dimension size = driver.manage().window().getSize();
//        System.out.println(size.getHeight());
//        System.out.println(size.getWidth());

//        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("./image.png"));


//        WebElement webElement = driver.findElement(By.cssSelector(".lnXdpd"));
//        File src = webElement.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("./image1.png"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        WebElement webElement = driver.findElement(By.name("btnI"));
//        js.executeScript("arguments[0].click();", webElement);
        js.executeScript("console.log('ajhsgfjahs')");


//        driver.close();
    }
}

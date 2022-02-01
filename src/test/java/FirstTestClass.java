import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTestClass {


    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "./drivers/driver.exe");
        WebDriverManager.chromedriver().setup();

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to("http://demo.guru99.com/");
        String title = chromeDriver.getTitle();
        System.out.println("Page title is = " + title);
        WebElement element = chromeDriver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");

        WebElement button = chromeDriver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
        chromeDriver.close();
    }

}

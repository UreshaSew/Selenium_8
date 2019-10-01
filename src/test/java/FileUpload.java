import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\crome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://demo.guru99.com/test/upload/");
        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\SelTest");
   driver.findElement(By.id("terms")).click();
   driver.findElement(By.id("submitbutton")).click();

    }
}
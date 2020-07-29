import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Bongo_SQA {

    public static WebDriver driver;
    static String BaseURL = "https://bongobd.com/";
    static JavascriptExecutor js;

    @BeforeTest
    public static void Websetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Fahim\\Desktop\\Selenium_Java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BaseURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        js = (JavascriptExecutor)driver;
    }

    @Test(priority = 1)
    public static void Free_content () throws InterruptedException {
         //Page_Scroll
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1250)", "");
        Thread.sleep(5000);
        //Mouse_Hover
        WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[9]/div/div[2]/div/div/div/div/div[2]/div/div/button/a/div"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        Thread.sleep(5000);
        //Free_content
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div[9]/div/div[2]/div/div/div/div/div[2]/div/div/button/a/div")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    //@Test(priority = 2)
    public static void Register () throws InterruptedException {
        //Register_Button
        driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
        Thread.sleep(3000);
        //User_PhoneNo:
        driver.findElement(By.xpath("//input[@id='phoneNumberInput']")).click();
        driver.findElement(By.xpath("//input[@id='phoneNumberInput']")).sendKeys("01677266742");
        Thread.sleep(5000);
        //Get_OTP
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[2]/button/span[1]")).click();
        Thread.sleep(3000);
        //Paste_OTP
        driver.findElement(By.xpath("//input[@id='codeInput']")).click();
        driver.findElement(By.xpath("//input[@id='codeInput']")).sendKeys("703920");
        Thread.sleep(5000);
        //Submit
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[2]/button[1]/span[1]")).click();
        Thread.sleep(10000);
        //Bongo_Logo
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/header/div/div/div[1]/a/img")).click();
        Thread.sleep(10000);
    }

    @Test(priority = 3)
    public static void Login () throws InterruptedException {
        //Login_Button
        driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
        Thread.sleep(3000);
        //User_PhoneNo:
        driver.findElement(By.xpath("//input[@id='phoneNumberInput']")).click();
        driver.findElement(By.xpath("//input[@id='phoneNumberInput']")).sendKeys("01677266742");
        Thread.sleep(5000);
        //Get_OTP
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[2]/button/span[1]")).click();
        Thread.sleep(3000);
        //Paste_OTP
        driver.findElement(By.xpath("//input[@id='codeInput']")).click();
        driver.findElement(By.xpath("//input[@id='codeInput']")).sendKeys("703920");
        Thread.sleep(5000);
        //Submit
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[3]/div/div/div/div[2]/button[1]/span[1]")).click();
        Thread.sleep(10000);
        //Bongo_Logo
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/header/div/div/div[1]/a/img")).click();
        Thread.sleep(10000);
    }

    @AfterTest
    public static void Test_Closure() {
        driver.quit();
    }

}

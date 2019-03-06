package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basictest {

    public static WebDriver driver;
    static String url = "http://104.211.245.164:4040/prohance";

    public static void  OpenBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/lib/win/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='tlogin']")).sendKeys("ssadmin");
        driver.findElement(By.xpath("//input[@id='tpwd']")).sendKeys("ssadmin@1");
        driver.findElement(By.xpath("//input[@class='btn-login']")).click();
        String NavigatedURL = driver.getTitle();
        System.out.println(NavigatedURL);
    }


    public  static void main(String args[]) throws InterruptedException {
        OpenBrowser();
    }

}
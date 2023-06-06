package com.deloitte.utils;

import com.deloitte.pageObjects.LoginObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.testng.Reporter.log;

public class CommonMethods {

    public WebDriver driver;
    LoginObjects lo = new LoginObjects(driver);

    public void launchUrl() throws IOException {

        // System.setProperty("webdriver.chrome.driver", "C:\\Office_Material\\exe files\\drivers\\chromedriver.exe");
        // System.setProperty("webdriver.chrome.driver", "\\Users\\kokalpana\\Automation\\AMP\\Makemytrip-DriverFix\\chromedriver.exe");
//        ChromeOptions opt = new ChromeOptions();
//        opt.setExperimentalOption("excludeSwitches", List.of("disable-popup-blocking"));
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        //return dr;
    }

    public void CancelAds() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@class='close']")).click();
        log("Close clicked");
       // lo.closeAd.click();

//        root.click();
//        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//        logVar.click();
    }

    public void SendCredentials()
    {
        lo.userName.sendKeys("mandal465devdut@gmail.com");
        lo.clickContinue.click();
    }
}

package com.deloitte.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class LoginObjects {
    //public WebDriver driver;


    public LoginObjects(WebDriver driver)
    {
       // this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut")
     WebElement logVar;
    @FindBy(xpath = "//a[@id = 'webklipper-publisher-widget-container-notification-close-div']")
    public WebElement closeAd;

    @FindBy(xpath = "//input[@id='username']")
    public  WebElement userName;
    @FindBy(css = "button[class='capText font16']")
    public  WebElement clickContinue;

    @FindBy(xpath = "root")
     public WebElement root;


}

package com.deloitte.tests;

import com.deloitte.pageObjects.LoginObjects;
import com.deloitte.utils.CommonMethods;
import org.testng.annotations.Test;

public class LoginToSite extends CommonMethods{

    @Test
    public void login() throws Exception
    {
        CommonMethods commonMethods = new CommonMethods();
        //LoginObjects logObj = new LoginObjects(dr);
        commonMethods.launchUrl();
        commonMethods.CancelAds();
        driver.close();

    }



}

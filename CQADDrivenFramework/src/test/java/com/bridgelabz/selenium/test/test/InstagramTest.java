package com.bridgelabz.selenium.test.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.Dashboard;
import com.bridgelabz.selenium.pages.LoginPage;
import com.bridgelabz.selenium.readexcel.DataProviderLogic;
import org.testng.Assert;
import org.testng.annotations.*;

public class InstagramTest extends BaseClass {
    LoginPage loginPage;
    Dashboard dashboard;
    @BeforeMethod
    @Parameters("browserName")
    public void setUp(@Optional ("chrome") String browser){
        initialization(browser);
        loginPage = new LoginPage(driver);
        dashboard = new Dashboard(driver);
    }

    @Test(dataProvider = "testData", dataProviderClass = DataProviderLogic.class)
    public void loginToInstagram(String userName, String Password) throws InterruptedException {
        String loginPageTitle = loginPage.loginToInsta(userName,Password);
        Assert.assertEquals("Instagram",loginPageTitle);
    }
    @AfterMethod
    public void browserClose(){
        tearDown();
    }
}

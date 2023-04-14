package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard extends BaseClass {
    @FindBy (xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement homeBtn;

    public Dashboard(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean homeTestValidation(){
        Boolean flag = homeBtn.isDisplayed();
        return flag;
    }
}

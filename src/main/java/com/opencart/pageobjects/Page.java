package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class  Page {
    public Page(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath = "//i[@class='fa-solid fa-user']")
    protected WebElement myAccountButton;




    public  void  navigateToRegisterPage() {
        myAccountButton.click();
        System.out.println("The My Account Button was clicked");


    }

    }




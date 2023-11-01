package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public   class RegisterPage  extends Page {
    public RegisterPage(WebDriver driver) { super(driver); }
    @FindBy(id = "input- firstname")
    private WebElement firstNameInput;
    @FindBy(id = "input- lastname")
    private  WebElement lastNameInput;
    @FindBy(id = "input- email")
    private  WebElement emailInput;
    @FindBy(id = "input- password")
    private  WebElement passwordInput;
    @FindBy(xpath = "//input[@name='agree']")
    private WebElement privacyCheckBox;
    @FindBy(css = "button [type='submit']")
    private  WebElement continueButton;


    }



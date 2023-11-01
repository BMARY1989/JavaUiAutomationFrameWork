package com.opencart;

import com.opencart.managers.DriverManager;
import com.opencart.managers.RandomDataManager;
import com.opencart.pageobjects.HomePage;
import org.openqa.selenium.*;



public  class TestRunner {

public static void main(String[] args) throws InterruptedException {
    DriverManager manager = DriverManager.getInstance();
    WebDriver driver = manager.getDriver();

     driver.get("https://andreisecuqa.host/");

    HomePage homePage = new HomePage(driver);
    homePage.navigateToRegisterPage();






        }



}

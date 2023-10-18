package com.opencart;

import com.opencart.managers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverManager.getInstance().getDriver();

        String currentWindoname = driver.getWindowHandle();

        // New Window Code
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://opencart.antropy.co.uk/");
        Thread.sleep( 5000);

        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));

        myAccountIcon.click();

        WebElement registerOption = driver.findElement(By.xpath("//a[normalize-space()='Register']"));

        registerOption.click();

        System.out.println(driver.getCurrentUrl());

WebElement firstNameInput  =  driver.findElement(By.id("input- firstname"));
firstNameInput.sendKeys("Victor");

WebElement lastNameInput = driver.findElement (By.cssSelector("# input-lastname"));
lastNameInput.sendKeys("Tescu");

WebElement emailInput = driver.findElement(By.cssSelector("#input-email"));
emailInput.sendKeys("boss007@gmail.com");

WebElement phoneInput = driver.findElement(By.cssSelector("#input-telephone"));
phoneInput.sendKeys("07985547");

WebElement passwordInput = driver.findElement(By.cssSelector("#input-password"));
passwordInput.sendKeys("Parola123!");

WebElement confirmPasswprdInput = driver.findElement(By.cssSelector("#input-confirm"));
confirmPasswprdInput.sendKeys("Parola123!");

WebElement  termsAndConditionCheckbox = driver.findElement(By.xpath("//input[@name='agree']"));
termsAndConditionCheckbox.click();

WebElement registerBtn = driver.findElement(By.xpath("//input[@value='Continue']"));
registerBtn.click();
        Thread.sleep( 5000);

        System.out.println(driver.getTitle());
        driver.close();

        driver.switchTo().window(currentWindoname);
        driver.get("https://tekwill.md/");
        Thread.sleep( 1000);
        System.out.println(driver.getTitle());
        driver.quit();
        System.out.println("The execution is over");





        }
    }

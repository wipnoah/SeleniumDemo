package com.bilbomatica.testing.training.seleniumDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert.*;
import org.openqa.selenium.By;

public class TumblrLoginTest extends  BaseLocalRemoteWebDriverTest{

    @Test
    public void testLogin(){
        driver.get("https://www.tumblr.com/");
        driver.findElement(By.id("signup_login_button")).click();
        driver.findElement(By.id("signup_determine_email")).sendKeys("wipnoah@gmail.com");
        driver.findElement(By.id("signup_forms_submit")).click();
         driver.findElement(By.id("signup_password")).sendKeys("blackdragon");
        driver.findElement(By.id("signup_forms_submit")).click();
        Assert.assertTrue(driver.findElementById("Compose-button")!= null);

    }
}

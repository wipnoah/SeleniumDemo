package com.bilbomatica.testing.training.seleniumDemo;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.Assert.*;
import org.openqa.selenium.By;

import static org.testng.Assert.assertTrue;

public class TumblrLoginWrongPassword extends BaseLocalRemoteWebDriverTest{


    @Test
    public void testLoginWrongPassword(){
        driver.get("https://www.tumblr.com/");
        driver.findElement(By.id("signup_login_button")).click();
        driver.findElement(By.id("signup_determine_email")).sendKeys("wipnoah@gmail.com");
        driver.findElement(By.id("signup_forms_submit")).click();
        driver.findElement(By.id("signup_password")).sendKeys("wrongpassword");
        driver.findElement(By.id("signup_forms_submit")).click();
        assertTrue(driver.findElement(By.cssSelector("BODY")).getText().contains("Your email or password were incorrect."));

    }

}

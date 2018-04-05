package com.bilbomatica.testing.training.SeleniumDemo;

import org.junit.Test;
import org.openqa.selenium.By;

public class TumblrLoginTest extends  BaseLocalRemoteWebDriverTest{

    @Test
    public void testLogin(){
        driver.get("https://www.tumblr.com/");
        driver.findElement(By.xpath("//button[@id='signup_login_button']/span")).click();
        driver.findElement(By.id("signup_determine_email")).clear();
        driver.findElement(By.id("signup_determine_email")).sendKeys("wipnoah@gmail.com");
        driver.findElement(By.id("signup_form")).submit();
        driver.findElement(By.id("signup_password")).clear();
        driver.findElement(By.id("signup_password")).sendKeys("blackdragon");
        driver.findElement(By.id("signup_form")).submit();
    }
}

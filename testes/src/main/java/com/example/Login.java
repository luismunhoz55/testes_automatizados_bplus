package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    
    public void fazerLogin(WebDriver driver, String email, String senha) {
        driver.findElement(By.id("loginEmail")).sendKeys(email);
        driver.findElement(By.id("loginSenha")).sendKeys(senha);
        driver.findElement(By.id("loginBotao")).click();
    }

}

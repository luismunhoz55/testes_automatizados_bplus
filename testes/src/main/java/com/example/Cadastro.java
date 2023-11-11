package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cadastro {
    
    public void cadastrar(WebDriver driver, String nome, String email, String password) {
        driver.findElement(By.id("cadastroNome")).sendKeys(nome);
        driver.findElement(By.id("cadastroEmail")).sendKeys(email);
        driver.findElement(By.id("cadastroSenha")).sendKeys(password);
        driver.findElement(By.id("cadastroConfirmarSenha")).sendKeys(password);
        driver.findElement(By.id("cadastroBotao")).click();
    }

}

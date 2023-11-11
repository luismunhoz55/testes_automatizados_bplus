package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://minicurso.fitzlaff.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.id("login")).click();

        String nome = "Luis Fernando Munhoz 10107646919 udesc";
        String email = "luisteste@gmail.com";
        String senha = "cursoTestesAutomatizados";

        // Cadastro cadastro = new Cadastro();
        // cadastro.cadastrar(driver, nome, email, senha);

        Login login = new Login();

        login.fazerLogin(driver, email, senha);

    }
}
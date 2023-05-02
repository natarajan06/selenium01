package com.example.day2.maven_archetype_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("jaga");
        driver.findElement(By.id("input-lastname")).sendKeys("Sekar");
        driver.findElement(By.cssSelector("#input-email")).sendKeys("jagapraveen26@gmail.com");
//        driver.findElements(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Jaga12345");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Jaga123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
    }
}
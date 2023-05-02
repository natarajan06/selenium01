package com.example.day2.maven_archetype_sample;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ex5 {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driv = new ChromeDriver(co);
		driver.get("https://www.google.co.in");
		driv.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium",Keys.ENTER);
		driv.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).clear();
		driv.findElement(By.xpath("//*[@id=\"APjFqb\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple",Keys.ENTER);
		driv.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple",Keys.ENTER);
	}
}
package mySeleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	public static void main(String[] args) {
		
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\MyLab\\ToolsAndSoftwares\\selenium-java-3.8.1\\browserdrivers\\chromedriver_v2.32_32bit.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://imgur.com/register");
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Ashish");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ashishemail4misc@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Ashish");
		driver.findElement(By.xpath("//*[@id='confirm_password']")).sendKeys("Ashish");
		
		driver.findElement(By.linkText("sign in")).click();		
		
		
	}

}
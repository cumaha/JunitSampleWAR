package mySeleniumPkg;



import java.io.IOException;
import java.net.InetAddress;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	public static void main(String[] args) throws IOException {
		

		InetAddress ips;
		ips = InetAddress.getLocalHost();
        String hostname = ips.getHostName();
		System.out.println(hostname);
		
	//Chrome Browser
        if ((hostname).equals("LAPTOP-0SGNH2UI")){ System.setProperty("webdriver.chrome.driver", "C:\\MyLab\\ToolsAndSoftwares\\selenium-java-3.8.1\\browserdrivers\\chromedriver_v2.32_32bit.exe");}
        if ((hostname).equals("W17044768")){ System.setProperty("webdriver.chrome.driver", "/opt/packages/tcwarpropfiles/chromedriver_v2.32_linux64");}
        if ((hostname).equals("jenkins")){ System.setProperty("webdriver.chrome.driver", "/opt/packages/tcwarpropfiles/chromedriver_v2.32_linux64");}
		WebDriver driver = new ChromeDriver();
		driver.get("https://imgur.com/register");
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Ashish");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ashishemail4misc@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Ashish");
		driver.findElement(By.xpath("//*[@id='confirm_password']")).sendKeys("Ashish");
		
		driver.findElement(By.linkText("sign in")).click();		
		
		
	}

}
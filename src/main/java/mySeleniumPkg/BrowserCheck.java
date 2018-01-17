package mySeleniumPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCheck {
	public static void main(String[] args) {
		
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\MyLab\\ToolsAndSoftwares\\selenium-java-3.8.1\\browserdrivers\\chromedriver_v2.32_32bit.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://youtube.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//Validation Point
		if(title.equals("Home")){
			System.out.println("Test Pass: correct Title");
		}
		else{
			System.out.println("Test Fail: incorrect Title");
		}
		driver.quit(); //close browser
		
	}

}

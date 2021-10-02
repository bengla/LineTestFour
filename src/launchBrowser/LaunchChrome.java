package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zaman\\June2021QA_Selenium\\1st_Selenium_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		//maximize
		driver.manage().window().maximize();
		//get web site
		driver.get("http://google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		//Thread.sleep(3000);
		//driver.findElement(arg0)
		
		//Thread.sleep(3000);
		//driver.close();
		
		

	}

}

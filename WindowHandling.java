package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		//Calling WDM for the browser driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				//Launch URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Enter the username and pwd using id locator
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//Click on the login button using class locator
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on CRM/SFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//Click on the leads button
				driver.findElement(By.linkText("Leads")).click();
				
				//Click the merge leads link
				driver.findElement(By.partialLinkText("Merge Leads")).click();
				
				//Click the icon following the from lead
		
		// TODO Auto-generated method stub

	}

}

package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		//Calling WDM for the browser driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				//Launch URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
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
				driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
				
				//Type the first name in the second window
				//Firt switch the control to the second window,in order to do that get the window handles in a set
				
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles.size());
				
				//Convert the set into a list to use the get method
				List<String> lstWindowHandles = new ArrayList<String>(windowHandles);
				
				//Get the second window handle
				String secondWindowHandle = lstWindowHandles.get(1);
				
				//Now switch it to second window
				driver.switchTo().window(secondWindowHandle);
				
				//Enter the first name
				driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Babu");
				
				//Click the find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(5000);
				//Click the first resulting link
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)")).click();
				
				//Move the control back to first window
				String firstWindowHandle = lstWindowHandles.get(0);
				driver.switchTo().window(firstWindowHandle);
				
				//Print the title of first window
				System.out.println(driver.getTitle());
		
		// TODO Auto-generated method stub

	}


}

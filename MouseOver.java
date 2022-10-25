package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {
		//Calling WDM for the browser driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				//Launch URL
				driver.get("https://www.flipkart.com/");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Add implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				//Click the close button
				driver.findElement(By.xpath("//button[text()='✕']")).click();
				
				//Find the login button
				WebElement Login = driver.findElement(By.xpath("//a[text()='Login']"));
				
				//Move to Actions class
				Actions builder = new Actions(driver);
				
				//Mouse over
				builder.moveToElement(Login).perform();
				
				
		// TODO Auto-generated method stub

	}

}

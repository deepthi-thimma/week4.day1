package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsFrames {

	public static void main(String[] args) {
		//Calling WDM for the browser driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				//Launch URL
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				//Maximize the window
				driver.manage().window().maximize();
				
				// click Try It : note - this is inside the frame
				driver.switchTo().frame("iFrameResult");
				driver.findElement(By.id("//button[text()='Try It']")).click();
				
				//clicks Cancel
				driver.switchTo().alert().dismiss();
				
				//prints the text
				String text = driver.findElement(By.id("demo")).getText();
				System.out.println(text);
				
		// TODO Auto-generated method stub

	}

}

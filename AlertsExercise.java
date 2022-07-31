package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsExercise {

	public static void main(String[] args) {
		//Calling WDM for the browser driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				
				//Launch URL
				driver.get("http://leafground.com/pages/Alert.html");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//To click the prompt box
				driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
				Alert alert = driver.switchTo().alert();
				String text = alert.getText();
				System.out.println(text);
				
				//Clicks OK
				alert.accept();
				
				//To  check whether the clciked option is true or not
				String text2 = driver.findElement(By.id("result1")).getText();
				System.out.println(text2);
				
				
				// TODO Auto-generated method stub

	}

}

package Meta.AWCTeamCenter;


import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsDemoTest1 {
 @Test
	public void JenkinsDemoTest1() throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost:3000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li/input[@name='userName']")).sendKeys("tcuser");
		driver.findElement(By.xpath("//li[2]/input")).sendKeys("FCT_TCUser2023");
		driver.findElement(By.xpath("//li/div/div[@class='aw-session-signInButton']")).click();
		System.out.print("Logged into the application");
		Thread.sleep(5000);
		String title = driver.getTitle();
		assertEquals(title,"Teamcenter - Home");
		driver.quit();

	}

}

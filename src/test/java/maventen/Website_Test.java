package maventen;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Website_Test {
	
	public static WebDriver driver;

		@Test
		public void Url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/menu/");
		
		System.out.println(driver.getCurrentUrl());
		
		String ExpectedUrl = "https://demoqa.com/menu/";
		String ActualUrl = driver.getCurrentUrl();
		System.out.println(ActualUrl);
		Assert.assertEquals(ActualUrl, ExpectedUrl);
		
			
		
		WebElement menu = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		WebElement women = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
		action.moveToElement(women).perform();
		System.out.println("Done mouse hover on sub menu");
		
		WebElement item = driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
		item.click();
		
		
	}
		
		
			
			
			
		

}

package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageJobs {
	
	@Test
	public void VerifyJobsPage() {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
	
		
		String baseURL = "https://www.thesparksfoundationsingapore.org/";
		driver.get(baseURL);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div[2]/div[2]/ul/li[1]/a"))).click();
		
	
		
		driver.navigate().to("https://www.indeedjobs.com/the-sparks-foundation/");
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/ul/li[4]/i"))).click();
		
		
		driver.close();
	}

}

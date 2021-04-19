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

public class PageWorkshops {
	
	@Test
	public void VerifyPage() {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		String baseURL = "https://www.thesparksfoundationsingapore.org/";
		driver.get(baseURL);
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div[1]/div[4]/ul/li[1]/a"))).click();
		
//		WebElement select = driver.findElementByXPath("/html/body/div[6]/div/div[1]/div[4]/ul/li[1]/a");
//		select.click();
		
		driver.navigate().to("https://www.thesparksfoundationsingapore.org/programs/workshops/glimpses-for-kids-workshop/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[4]/a"))).click();
		
//		WebElement workshop = driver.findElementByXPath("/html/body/div[2]/div/div[2]/div/ul/li[4]/a");
//		workshop.click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.close();
		
	}

}

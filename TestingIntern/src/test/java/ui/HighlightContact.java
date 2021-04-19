package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightContact {
	
	@Test
	public void CheckEmail() {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		
		String baseURL = "https://www.thesparksfoundationsingapore.org/";
		driver.get(baseURL);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.thesparksfoundationsingapore.org/contact-us/");
		
		String expectedAddress = "+65-8402-8590, info@thesparksfoundation.sg";
		String actualAddress = "";
		
		actualAddress = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/p[2]")).getText();
		
		
		WebElement highlight = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/p[2]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid green;');", highlight);
		
		Assert.assertEquals(actualAddress,expectedAddress);
		
		
		
		driver.close();
		
	}

}

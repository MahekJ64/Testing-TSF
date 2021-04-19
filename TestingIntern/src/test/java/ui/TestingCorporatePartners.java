package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingCorporatePartners {
	
	@Test
	public void TestPage() {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver  = new EdgeDriver();
		
		driver.manage().window().maximize();
	//	driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
		
		String baseURL = "https://www.thesparksfoundationsingapore.org/about/corporate-partners/";
		driver.get(baseURL);
		
		WebElement highlight = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div[2]/a/img"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid green;');", highlight);
		
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div[2]/a"))).click();
		
	//	WebElement find = driver.findElementByXPath("/html/body/div[2]/div/div[1]/div/div[1]/div/div[2]/a");
	//	find.click();
		
		driver.close();
		
	}

}

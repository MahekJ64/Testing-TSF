package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoTesting {
	
	@Test
	public void VerifyLogo() {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		String baseURL = "https://www.thesparksfoundationsingapore.org/";
		driver.get(baseURL);
		
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img"));

		Boolean p = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete "
		+ "&& typeof arguments[0].naturalWidth != \"undefined\" "
		+ "&& arguments[0].naturalWidth > 0", logo);
		
		System.out.println(p);
		
		
		driver.close();
		
	}

}

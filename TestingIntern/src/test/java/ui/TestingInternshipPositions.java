package ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingInternshipPositions {
	
	@Test
	public void TestPage() {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver  = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		String baseURL = "https://www.thesparksfoundationsingapore.org/";
		driver.get(baseURL);
		
		WebElement find = driver.findElementByXPath("/html/body/div/div/div[2]/nav/div[2]/nav/ul/li[5]/a");
		find.click();
		
		WebElement select = driver.findElementByXPath("/html/body/div/div/div[2]/nav/div[2]/nav/ul/li[5]/ul/li[5]/a");
		select.click();
		
	}

}

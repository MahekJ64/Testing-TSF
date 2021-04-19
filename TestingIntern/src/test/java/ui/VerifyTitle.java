package ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitle {
	
	@Test
	public void TestTitle() {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		String baseURL = "https://www.thesparksfoundationsingapore.org/";
		String expectedTitle = "The Sparks Foundation | Home";
		String actualTitle = "";
		
		driver.get(baseURL);
		actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
	}
	
}

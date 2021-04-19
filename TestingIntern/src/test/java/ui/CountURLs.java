package ui;

import io.github.bonigarcia.wdm.WebDriverManager;

//import java.awt.List;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountURLs {

	@Test
	public void CountAndDisplayURLs() {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

		String baseURL = "https://www.thesparksfoundationsingapore.org/";
		driver.get(baseURL);

		String url = "";
	
		List<WebElement> allURLs = driver.findElements(By.tagName("a"));
		System.out.println("Total links on the Wb Page: " + allURLs.size());

		// We will iterate through the list and will check the elements in the list.
		Iterator<WebElement> iterator = allURLs.iterator();
		while (iterator.hasNext()) {
			url = iterator.next().getText();
			System.out.println(url);
		}

		
		driver.close();
		
	}

}

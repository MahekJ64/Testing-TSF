package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLINKS {

	@Test
	public void PageTesting() {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		String baseURL = "https://www.thesparksfoundationsingapore.org/";
		driver.get(baseURL);

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/nav/div[2]/nav/ul/li[4]/a"))).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/nav/div[2]/nav/ul/li[4]/ul/li/a")))
				.click();

		driver.navigate().to("https://www.thesparksfoundationsingapore.org/links/software-and-app/");

		WebElement highlight = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[1]/a"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 2px solid green;');", highlight);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[1]/a")))
				.click();

		driver.close();

	}

}

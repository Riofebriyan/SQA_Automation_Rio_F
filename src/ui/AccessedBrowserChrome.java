package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessedBrowserChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browsedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
		driver.get("http://automationpractice.com/index.php");
	}

}

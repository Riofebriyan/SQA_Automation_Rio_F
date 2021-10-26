package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browsedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		driver.findElement(By.id("email")).sendKeys("35@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("ryujiutomo15");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
		
	}

}

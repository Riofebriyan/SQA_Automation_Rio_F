package ui;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\browsedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.get("http://automationpractice.com/index.php?controller=authentication");
		driver.findElement(By.id("email_create")).sendKeys("39@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/div/div[3]")).click();
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='1']"));
		WebElement radio2 = driver.findElement(By.xpath("//input[@value='2']"));
	
		radio1.click();
		}

}

package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Add_Remove_Elements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//Launch the Browser
		WebDriver driver = new FirefoxDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Enter the URL
		driver.get("https://the-internet.herokuapp.com/");
		
		//Click on Add/Remove Link
		driver.findElement(By.xpath("//a[.='Add/Remove Elements']")).click();
		Thread.sleep(1000);
		
		//Click on Add Element Button
		driver.findElement(By.xpath("//button[.='Add Element']")).click();
		Thread.sleep(1000);
		
		//Click on Delete Button
		driver.findElement(By.xpath("//button[.='Delete']")).click();
		Thread.sleep(2000);
		
		//Close the Browser
		driver.quit();

	}
}

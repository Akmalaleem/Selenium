package selenium_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inserting_Usrname_Password {
	
	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akmal203@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akmal@203");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		driver.close();
	}

}

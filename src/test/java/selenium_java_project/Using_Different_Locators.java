package selenium_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Different_Locators {

	public static void main(String[] args)
	{
		Using_Different_Locators obj=new Using_Different_Locators();
		
		obj.content_filling();
	}


	public void content_filling()
	{
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "D:\\chrome_driver\\chromedriver_106.exe");

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.name("email")).sendKeys("Arsal@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("arsal_akmal");

		driver.findElement(By.xpath("//button[@name='login']")).click();

		//driver.close();

		System.out.println("Test was sucessful");
	}

}

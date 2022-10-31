package selenium_java_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {
	
	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome_driver\\\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Assassin%27s_Creed");
		driver.findElement(By.xpath("//div[@role='note']/a[2]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		System.out.println("Test Sucessful");
	}

}

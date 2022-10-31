package selenium_java_project;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class C_50_Q_4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome_driver\\\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		String m_page=driver.getWindowHandle();
		driver.findElement(By.id("simpleLink")).click();
		Set<String> A_page=driver.getWindowHandles();
		for(String ele:A_page)
		{
			if(!(ele.equals(m_page)))
			{
				driver.switchTo().window(ele);
				System.out.println("Current Url: "+driver.getCurrentUrl());
				System.out.println("Current Title: "+driver.getTitle());
			}
		}
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Test Sucessful");
	}

}

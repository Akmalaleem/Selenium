package selenium_java_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class C_50_Q_02 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome_driver\\\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		boolean b_visible= driver.findElement(By.id("addNewRecordButton")).isDisplayed();
		if(b_visible)
		{
			System.out.println("Page Fully Loaded Proceed With The Code");
			List<WebElement> ele=driver.findElements(By.xpath("(//div[@class='rt-tr-group']/div/div[6])[text()]"));
			int cnt=0;
			for(WebElement num:ele)
			{
				cnt++;
				if(!(cnt%2==0))
				{
					System.out.println(num.getText());
				}
			}
		}
		else
		{
			System.out.println("Page not loaded");
		}
		
		Thread.sleep(5000);
		driver.close();
		System.out.println("Test Sucessful");
	}

}

package selenium_java_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	
	public static void main(String[] args){
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome_driver\\\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create New Account']")));
		ele.click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akmal");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		driver.navigate().back();
		driver.quit();
		System.out.println("Successful");
	}

}

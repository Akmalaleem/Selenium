package selenium_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_49_Q_5 {
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome_driver\\\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		WebElement source= driver.findElement(By.xpath("//h5[text()='Elements']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", source);
		source.click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		driver.findElement(By.id("userName")).sendKeys("Mahammad Akmal Aleem");
		driver.findElement(By.id("userEmail")).sendKeys("Akmal203@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Dhatkidih");
		driver.findElement(By.id("permanentAddress")).sendKeys("Dhatkidih");
		WebElement button=driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		button.click();
		String url1=driver.getCurrentUrl();
		System.out.println("Current url: "+url1);
		String title=driver.getTitle();
		System.out.println("Current tagname: "+title);
		System.out.println("Test Sucessful");
		Thread.sleep(3000);
		driver.quit();
	}

}

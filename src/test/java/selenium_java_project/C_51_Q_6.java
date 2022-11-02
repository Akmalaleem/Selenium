package selenium_java_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_51_Q_6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\\\chrome_driver\\\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		WebElement B1=driver.findElement(By.xpath("//h5[text()='Elements']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", B1);
		B1.click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Mahammad Akmal Aleem");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Akmal203@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Jamshedpur");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Jamshedpur");
		B1=driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].scrollIntoView();", B1);
		B1.click();
		String l1=driver.findElement(By.xpath("//p[@id='name']")).getText();
		String[] l11=l1.split(":");
		int cnt=0;
		if(l11[1].equals("Mahammad Akmal Aleem"))
		{
			cnt++;
		}
		l1=driver.findElement(By.xpath("//p[@id='email']")).getText();
		l11=l1.split(":");
		if(l11[1].equals("Akmal203@gmail.com"))
		{
			cnt++;
		}
		l1=driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
		l11=l1.split(":");
		if(l11[1].equals("Jamshedpur"))
		{
			cnt++;
		}
		l1=driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
		l11=l1.split(":");
		if(l11[1].equals("Jamshedpur"))
		{
			cnt++;
		}
		Thread.sleep(5000);
		driver.close();
		if(cnt==4)
		{
			System.out.println("Test Sucessful");
		}
	}

}

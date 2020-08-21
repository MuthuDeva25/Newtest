package Tnstc;




import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TnstcDrop {
	@Test
	public void Drop() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tnstc.in/home.html");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		Screenshot.captureScreenshot(driver,"print1");
		
		driver.findElement(By.xpath("//*[@id='cboxClose']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='matchStartPlace']")).sendKeys("Kanchipuram");
		Thread.sleep(2000);
		Screenshot.captureScreenshot(driver,"print2");
		
		driver.findElement(By.xpath("//*[@id='matchEndPlace']")).sendKeys("CHENNAI-PT Dr. M.G.R. BS");
		Thread.sleep(2000);
		Screenshot.captureScreenshot(driver,"print3");
		
		Select defaultDropdown=new Select(driver.findElement(By.xpath("//*[@id='selectOnwardTimeSlab']")));
		WebElement value=defaultDropdown.getFirstSelectedOption();
		System.out.println("The default option ======>>>"+value.getText());


		Select dropdown=new Select(driver.findElement(By.xpath("//*[@id='selectOnwardTimeSlab']")));
		dropdown.selectByValue("00:00-23:59");
		Thread.sleep(2000);

		Select dropdown1=new Select(driver.findElement(By.xpath("//*[@id='selectOnwardTimeSlab']")));
		dropdown1.selectByVisibleText("BEFORE 12 PM");
		Thread.sleep(2000);

		Select dropdown2=new Select(driver.findElement(By.xpath("//*[@id='selectOnwardTimeSlab']")));
		dropdown2.selectByVisibleText("12PM - 08PM");
		Thread.sleep(2000);
		Screenshot.captureScreenshot(driver,"print4");
		Select dropdown3=new Select(driver.findElement(By.xpath("//*[@id='selectOnwardTimeSlab']")));
		dropdown3.selectByVisibleText("08PM - 12AM");
		Thread.sleep(2000);

		Screenshot.captureScreenshot(driver,"print5");

		driver.quit();









	}

}


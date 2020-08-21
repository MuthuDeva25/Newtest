package Tnstc;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




public class Screenshot{

	  

	public static void captureScreenshot(WebDriver driver, String name) {
		 TakesScreenshot ts=(TakesScreenshot)driver;
		   File source= ts.getScreenshotAs(OutputType.FILE);
		   try {
			FileUtils.copyFile(source,new File("./ScreenshotsTaken/"+name+".png"));
		} catch (Exception e) {
			
			System.out.println("There was error in try catch");
		}
		   System.out.println("SS taken");
	
		
	}
  
	
	
}

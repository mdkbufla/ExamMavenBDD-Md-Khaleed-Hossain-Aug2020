package page;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class BackgroundColorCheck3 {
	WebDriver driver;
	
	 public BackgroundColorCheck3(WebDriver driver) { //constructor
	  this.driver = driver;
	 }
		@Test 
		public void Test1() {
			//"sky blue background" -button exists 
			
			//turning page blue
			//String text = driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).getText();
			driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).click();
			System.out.println("blue");
		}
		@Test
		public void Test2() {
			//"sky blue background" -button exists 

			//turning page white
			driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).click();
			System.out.println("white");
			driver.quit();
		
		// driver.findElement(By.xpath("//body[contains(@style,'skyblue')]"));
		 //Screenshot 
//		 public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
//			 TakesScreenshot ts = ((TakesScreenshot)driver); //this is a syntax
//			 SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
//			 Date date = new Date();
//			 String label = formatter.format(date);
//			 File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//			 String currentDir = System.getProperty("user.dir");
//			 FileUtils.copyFile(sourceFile, new File(currentDir + "/screenshots/"+ label +".png"));
//			 
//		
			}
	}



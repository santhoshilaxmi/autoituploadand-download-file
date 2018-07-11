package fileupload;
import java.io.IOException;		
import java.io.IOException;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;		
public class Filetoupload {				
public static void main(String[] args) throws IOException, InterruptedException {								
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "C:/Users/DELL/drivers/new chrome/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
   // Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\fileupload.exe");
    driver.get("http://demo.guru99.com/test/upload/");	
    Thread.sleep(3000);
    //Actions builder = new Actions(driver);
    //builder.moveToElement(driver.findElement(By.xpath("//*[@id='uploadfile_0']"))).click().perform();
    driver.findElement(By.xpath("//*[@id='uploadfile_0']")).click();
    Thread.sleep(20000);
    Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\fileupload.exe");
    // Process p =Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\fileupload.exe");
    //p.waitFor();
    //if (p.exitValue()==1) {
      //  System.out.println("YAY!");
    //}
    //else {
      //  System.out.println("boo");
    //}
    // below line execute the AutoIT script .
     //Runtime.getRuntime().exec("");		
    //driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
    //driver.findElement(By.id("input_2")).click();
    //driver.close();
     }
}

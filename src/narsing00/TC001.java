package narsing00;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
public class TC001 {
	public static void main(String arg[])throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nit82\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php/");
		driver.findElement(By.name("")).sendKeys();
		driver.findElement(By.name("")).sendKeys();
		driver.findElement(By.name("")).click();
		Thread.sleep(5000);
	}

}

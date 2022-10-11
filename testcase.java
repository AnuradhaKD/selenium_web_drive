package attendance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class localhost {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Projects\\JAVA\\eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
    }
}
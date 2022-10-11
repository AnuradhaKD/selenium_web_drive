package attendance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class atendance {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Projects\\JAVA\\eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:\\F:\\Campus\\Notes\\Year 03\\Semester 02\\Practical\\SQA\\Practice_1\\index.html");
				
		driver.manage().window().maximize();
		
		driver.findElement(By.name("f_name")).sendKeys("Joseph Vijay");
		
		driver.findElement(By.name("")).sendKeys("Chandrasekhar");
		
		driver.findElement(By.name("dob")).sendKeys("06-22-1974");
		
		driver.findElement(By.id("email")).sendKeys("vijay@yahoo.com");
		
		driver.findElement(By.name("phnno")).sendKeys("+9167 765 4321");
		
		driver.findElement(By.id("adrs")).sendKeys("64, Kaveri Street, Saligramam, Chennai 600093, TamilNadu, India");
		
		driver.findElement(By.id("male")).click();
		
		driver.findElement(By.name("hobby_1")).click();
		driver.findElement(By.name("hobby_2")).click();
		
		WebElement dropdown = driver.findElement(By.id("course"));
		Select select = new Select(dropdown);
		select.selectByValue("B.Tech");
		
		String pswd = "vijay@12345";
		String rwd =  "vijay@12345";
		
		driver.findElement(By.name("pswd")).sendKeys(pswd);
		driver.findElement(By.id("rpw")).sendKeys(rwd);
		
		if(pswd==rwd) {
			System.out.print("Passwords are equal");
			driver.findElement(By.name("result")).sendKeys("2A , B");
			driver.findElement(By.name("z_score")).sendKeys("1.225");
			driver.findElement(By.name("d_rank")).sendKeys("1");
		}
		else {
			System.out.print("Passwords are not equal");
		}


	}

}

package attendance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class localhost {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Projects\\JAVA\\eclips\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://localhost/employee/admin/index.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("admin123");

		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button[1]")).click();
		
//		logout
		
//		driver.findElement(By.xpath("/html/body/nav/div/div[2]/a/i")).click();
		
		
//		navigate employee
		
		driver.findElement(By.xpath("//*[@id=\"Employee\"]")).click();
		
//		search
		
//		driver.findElement(By.xpath("//*[@id=\"table_filter\"]/label/input")).sendKeys("a");
		
		
//		add data

		driver.findElement(By.xpath("//*[@id=\"new_emp_btn\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[1]/input[2]")).sendKeys("a");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[2]/input")).sendKeys("k");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[3]/input")).sendKeys("d");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[4]/input")).sendKeys("HR");
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[1]/div[5]/input")).sendKeys("Staff");
		
		driver.findElement(By.xpath("//*[@id=\"employee_frm\"]/div[2]/button")).click();
		
		driver.switchTo().alert().accept();
	}

}

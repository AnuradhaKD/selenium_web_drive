package attendance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
	
	WebDriver driver;
	String url = "https://www.ebay.com/";

	public static void main(String[] args) {
		ebay ebay = new ebay();
		ebay.openBrowser();
		ebay.searchProducts("Apple Phones", "Jewelry & Watches");
//		ebay.printTotalResults();
//		ebay.printNthResult(10);
//		ebay.printall();
		ebay.screenScroll();
	}

	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Projects\\JAVA\\eclips\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); // for load the page fully
		driver.get(url);
	}

	public void searchProducts(String product, String category) {

		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(product);
		driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")).sendKeys(category);

		WebElement Search = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
		Search.click();

	}

	public void printTotalResults() {
		String results = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1")).getAttribute("textContent");

		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(results);
		System.out.println("---------------------------------------------------------------------------------------");

	}
	
	public void printNthResult(int num) {
		String nProducts = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li["+ num +"]")).getText();
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("number you enter : " + num);
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(nProducts);
		System.out.println("---------------------------------------------------------------------------------------");

	}
	
	public void printall() {
		List<WebElement> allProducts = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul/li"));
		
		for (WebElement product : allProducts) {
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(product.getText());
			System.out.println("---------------------------------------------------------------------------------------");
		}

	}
		
	public void screenScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> allProducts = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul/li"));
		int count = 1;
		for (WebElement product : allProducts) {
			js.executeScript("arguments[0].scrollIntoView(true);",
			driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[" + count + "]")));
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println(product.getText());
			System.out.println("---------------------------------------------------------------------------------------");
			count++;
		}
	}
}

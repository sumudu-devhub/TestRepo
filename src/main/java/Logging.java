import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logging {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url ="https://www.ebay.com/";
		String expectedTitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actualTitle="";
		driver.get(url);
		
		actualTitle=driver.getTitle();
		if(actualTitle.contains(expectedTitle)) {
			
			System.out.println("TestPass");
		}
		else {System.out.println("TestFail");
			
		}
		
			
		
		
		driver.close();
		
		

	}

}

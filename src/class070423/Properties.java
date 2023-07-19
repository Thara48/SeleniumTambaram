package class070423;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\eclipse-workspace\\Selenium_home_works\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        Properties prop = new Properties();
        //prop.load(new FileInputStream("./config.properties"));
        
        
	}

}

package class070423;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_site {

	public static void main(String[] args) throws InterruptedException {
        //Map concepts
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Collection - upcasting
        //driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMI94y2ru-0_gIVVpJmAh1qoAv0EAAYASAAEgJjVfD_BwE");
        driver.get("https://www.amazon.com/ref=nav_logo");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Makeup" +(Keys.ENTER));
        Thread.sleep(5000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(5000);
//we can perform the search operation either with ,enter or click keywords-depends on requirements
       driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a"));
       

	}

}

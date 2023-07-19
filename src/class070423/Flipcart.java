package class070423;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/?ef_id=6459f2e123a31bccf93b96a4c3b8788f:G:s&s_kwcid=AL!739!10!76484920232329!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[1]")).click();
        Thread.sleep(3000);
        driver.navigate().to("https://www.flipkart.com/?ef_id=6459f2e123a31bccf93b96a4c3b8788f:G:s&s_kwcid=AL!739!10!76484920232329!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]")).click();
        Thread.sleep(3000);
        
	}

}

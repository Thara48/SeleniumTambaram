package FaceBook;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIN {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		//asusual cmds
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\asus\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		//handling the browser notifications
  		ChromeOptions PushNotification = new ChromeOptions();
  		PushNotification.addArguments("--disable-notifications");
    
		WebDriver driver = new ChromeDriver(PushNotification);
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
        WebElement LoginPhone = driver.findElement(By.id("email"));
        LoginPhone.sendKeys("8248705208");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
      
        WebElement LoginPassword = driver.findElement(By.id("pass"));
        LoginPassword.sendKeys("shaliniKoushal@48");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
        WebElement EyeToggleOpen = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div/a/div/div"));
        EyeToggleOpen.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
        WebElement EyeToggleOpen1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div/a/div/div"));
        EyeToggleOpen1.click();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        
        WebElement LoginBtn = driver.findElement(By.name("login"));
        LoginBtn.click();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS); 
        
       /* WebElement LogoutImage = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[1]/span/div/div[1]/div/svg/g/image"));
        LogoutImage.click();
        Thread.sleep(1000);  
        
        WebElement ConfirmLogout = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[5]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span"));
        ConfirmLogout.click();
        Thread.sleep(2000);  */
        
        
        WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
        lstitem.click();

        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

        driver.findElement(By.partialLinkText("Log Out")).click();

        System.out.println("Log out");
        
        
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(80));
    	WebElement logout=	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Log Out'] ")));
    	logout.click();
    	Thread.sleep(5000);
    	driver.quit();
	}

}

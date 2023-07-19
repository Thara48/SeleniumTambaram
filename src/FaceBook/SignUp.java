package faceBook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\asus\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        WebElement NewAcc = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
        NewAcc.click();
        Thread.sleep(2000); 
        
        WebElement FirstName = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
        FirstName.sendKeys("Shalini");
        Thread.sleep(2000); 
        
        WebElement LastName = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
        LastName.sendKeys("Murugan");
        Thread.sleep(2000); 
        
        WebElement Mob = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
        Mob.sendKeys("8248705208");
        Thread.sleep(2000); 
        
        WebElement Password = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
        Password.sendKeys("shaliniKoushal@48");
        Thread.sleep(2000); 
        
        WebElement DropDownDay = driver.findElement(By.id("day"));
        DropDownDay.click();
        Select day = new Select(DropDownDay);
        day.selectByVisibleText("4");
        Thread.sleep(2000); 
        
        WebElement DropDownMonth = driver.findElement(By.id("month"));
        DropDownMonth.click();
        Select Month = new Select(DropDownMonth);
        Month.selectByVisibleText("Mar");
       
        Thread.sleep(2000); 
        
        WebElement DropDownYear = driver.findElement(By.id("year"));
        DropDownYear.click();
        Select Year = new Select(DropDownYear);
        Year.selectByVisibleText("1999");
        Thread.sleep(2000); 
        
        WebElement sex = driver.findElement(By.name("sex"));
        sex.click();
        Thread.sleep(2000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,50)", "");
        Thread.sleep(1000);
        
        WebElement Signup = driver.findElement(By.name("websubmit"));
        Signup.click();
        Thread.sleep(1000);
        
        //
        WebElement continueeusing = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[2]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div"));
        continueeusing.clear();
        Thread.sleep(2000);
        
        
        
	}

}

package testLeaf;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBasics {
	WebDriver driver = new ChromeDriver();
public void DropdownBasicExercise() throws InterruptedException {
		
        //System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\asus\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        driver.get("https://leafground.com/dashboard.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement Elements = driver.findElement(By.id("menuform:j_idt40"));
        Thread.sleep(2000);
        Elements.click();
        System.out.println("The Elements are clicked");
        
        WebElement DropdownEle = driver.findElement(By.xpath("//li//span[text()='Dropdown']"));
        DropdownEle.click();
        Thread.sleep(2000);
        
        WebElement UITool = driver.findElement(By.xpath("//option[text()='Select Tool']"));
        UITool.click();
        Select Tool = new Select(UITool);
        Tool.selectByIndex(1);
        Thread.sleep(2000); 
        
        WebElement country = driver.findElement(By.xpath("//label[@id=\"j_idt87:country_label\"]"));
        country.click();
        Select CC = new Select(country);
        CC.selectByValue(null);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		DropDownBasics DD = new DropDownBasics();
		DD.DropdownBasicExercise();
	}

}

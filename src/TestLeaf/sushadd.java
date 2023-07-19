package testLeaf;
/*package Selenium.Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Listdup
{
	public void listop(String[] c) throws InterruptedException
	{
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(option);
	driver.manage().window().maximize();
	driver.get("https://leafground.com/select.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebElement course=driver.findElement(By.xpath("//div[@id='j_idt87:auto-complete']//button[contains(@class,'ui-autocomplete-dropdown ')]"));  
	course.click();
	/* List<WebElement> elements =driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li"));
	    for (WebElement eachValue :elements )
		{
			String eachCourse = eachValue.getText();
			if(c.equalsIgnoreCase(eachCourse)||cc.equalsIgnoreCase(eachCourse))
			{
				eachValue.click();
				
			
			}
		}
	int count=0;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li[1]")));
	List<WebElement> elements =driver.findElements(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li"));
	int elementsCount=elements.size();
	for(String eachvalueinarray : c)
	{
		
	for( int x=1;x<elementsCount;x++) 
    {
		System.out.println(x);
		// Thread.sleep(100);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li[1]"),"AWS"));
		
     WebElement client =driver.findElement(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li["+x+"]"));
    String s=client.getText();
  System.out.println(s);
        if(s.equalsIgnoreCase(eachvalueinarray))
        {
        client.click();	
        count++;
        System.out.println(count);
        Thread.sleep(500);
        course.click();
       
        break;
        }
        }
	}
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id='j_idt87:auto-complete_panel']//li[1]"),"AWS"));
	List<WebElement>closewindow =driver.findElements(By.xpath("//span[contains(@class,'ui-autocomplete-token-icon')]"));
    for (WebElement eachValue :closewindow )
	{
    	eachValue.click();
	}
	
	   }
	public static void main(String[] args) throws InterruptedException
	{
		Listdup t=new Listdup();
		String[] course= {"AWS","ReactJs","JMeter"};
		t.listop(course);
	}
}*/

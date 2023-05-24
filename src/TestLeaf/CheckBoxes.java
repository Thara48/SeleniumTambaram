package TestLeaf;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	WebDriver driver = new ChromeDriver();
	
	public void Basic() throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\asus\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        driver.get("https://leafground.com/dashboard.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement Elements = driver.findElement(By.id("menuform:j_idt40"));
        Thread.sleep(2000);
        Elements.click();
        WebElement CheckBoxEle = driver.findElement(By.id("menuform:m_checkbox"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        CheckBoxEle.click();
        
        WebElement CheckOne = driver.findElement(By.xpath("//span[text()='Basic']"));
        CheckOne.click();
        WebElement CheckNotification = driver.findElement(By.xpath("//span[text()='Ajax']"));
        CheckNotification.click();
                     if(driver.findElement(By.xpath("//div//span[text()='Checked']")) != null) 
                           {
	                        System.out.println("The Notification bar is clicked ");
                           }
		              else {
	    	                System.out.println("The Notification bar is not clicked ");
		              }
	}
	
	public void Tristate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\asus\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        driver.get("https://leafground.com/dashboard.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement Elements = driver.findElement(By.id("menuform:j_idt40"));
        Thread.sleep(2000);
        Elements.click();
        WebElement CheckBoxEle = driver.findElement(By.id("menuform:m_checkbox"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        CheckBoxEle.click();                       
        WebElement Tristate = driver.findElement(By.id("j_idt87:ajaxTriState"));
        Tristate.click();
        Thread.sleep(3000);
        
       if(driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-check']")) != null) {
        	System.out.println("The Trisate is in 1 ");
        	Thread.sleep(2000);
        	Tristate.click();
        	Thread.sleep(2000);
            WebElement Tristate2 = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-closethick']"));
        	System.out.println("The Trisate is in 2 ");
        	Thread.sleep(2000);
        	Tristate2.click(); 
        	Thread.sleep(2000);
            WebElement Tristate3 = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c']"));
       	    System.out.println("The Trisate is in 0 ");
          	Thread.sleep(2000);
            System.out.println("Finally the value of Trisate is 0");
        	}
	}

	
	public void toggle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\asus\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        driver.get("https://leafground.com/dashboard.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement Elements = driver.findElement(By.id("menuform:j_idt40"));
        Thread.sleep(2000);
        Elements.click();
        WebElement CheckBoxEle = driver.findElement(By.id("menuform:m_checkbox"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        CheckBoxEle.click();      
        WebElement Toggle = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']"));
        Toggle.click();
        Thread.sleep(3000);
        if(driver.findElement(By.xpath("//input[@id='j_idt87:j_idt100_input' and contains(@aria-checked,'true')]")) != null) {
        	Toggle.click();
        	 Thread.sleep(2000);
        }else if(driver.findElement(By.xpath("//input[@id='j_idt87:j_idt100_input' and contains(@aria-checked,'false')]")) != null){
        	Toggle.click();
        	System.out.println("Toggle is checked");
        }      		
	}
	
	
	public void Disabled() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\asus\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        driver.get("https://leafground.com/dashboard.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        WebElement Elements = driver.findElement(By.id("menuform:j_idt40"));
        Thread.sleep(2000);
        Elements.click();
        WebElement CheckBoxEle = driver.findElement(By.id("menuform:m_checkbox"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        CheckBoxEle.click();
        WebElement disable = driver.findElement(By.id("j_idt87:j_idt102"));
		//WebElement disable= driver.findElement(By.xpath("//div[@id ='j_idt87:j_idt102']"));
        boolean actualvalue = disable.isEnabled();
        
        if(actualvalue) {
        	System.out.println("The field is disabled");
        }else
        {
        	System.out.println("The field is enabled");
        }
	}
	
	public void language() {
		WebElement Lang = driver.findElement(By.xpath("//div//table[@id='j_idt87:basic']"));
	}
	
	public static void main(String[] args) throws InterruptedException {
		
        //Create Obj for all the methods
		//ClassName name = new ClassName();
		
		CheckBoxes TestLeaf = new CheckBoxes();
		TestLeaf.Disabled();
 

        
        
        
                  
      
      
     
        
}

}



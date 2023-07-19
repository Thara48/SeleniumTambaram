package class070423;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworksBasics {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.getTitle();
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Makeup" +(Keys.ENTER));
        Thread.sleep(2000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://www.purplle.com/track?campaign=GS_Google_Sok_Search_Brand_Misspell&redirect=https%3A%2F%2Fwww.purplle.com%2F&dpl=1&gclid=EAIaIQobChMIrd2hqeag_gIVjXwrCh1MOwi6EAAYASAAEgL4v_D_BwE");
        Thread.sleep(5000);
        driver.getTitle();
        driver.navigate().back();
        Thread.sleep(3000);
        //driver.close();
        //System.out.println("Cannot perform switch tab now!!");
        //Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAjw8-OhBhB5EiwADyoY1a2IWRsqQqfRv5zpUGfeKGaGTB4CV9X9kFtVFkW8pN8trNELcERXGhoC5bcQAvD_BwE");
        Thread.sleep(2000);
        driver.getTitle();
        driver.quit();
        
        
        
        
        
        
        
        
        
//        package firstLaunch;
//        import java.util.ArrayList;
//        import java.util.List;
//        import java.util.Set;
//
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WindowType;
//        import org.openqa.selenium.chrome.ChromeDriver;
//        public class WindowHandling 
//        {
//        public static void main(String[] args) throws InterruptedException
//        {
//        	// TODO Auto-generated method stub
//
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\prsus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//
//        WebDriver driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.amazon.com");	//parentwindow
//        driver.switchTo().newWindow(WindowType.TAB);// to open a new tab
//        driver.get("https://www.gmail.com");	//childwindow
//        Set<String> handles=driver.getWindowHandles(); 
//        /*(getWindowHandles())-->with this method we get the unique ids of 
//        //the all the windows opened by the webdriver.
//        //its return type is set.
//        Duplicate values are not allowed by set.*/
//
//        List<String>ls=new ArrayList<String>(handles);
//        String parentWindowId=ls.get(0);
//        String childWindowId=ls.get(1);
//        System.out.println(parentWindowId);
//        System.out.println(childWindowId);
//        System.out.println("Before Switch"+driver.getTitle());
//        //Thread.sleep(3000);
//        driver.switchTo().window(parentWindowId);
//        Thread.sleep(3000);
//        driver.switchTo().window(childWindowId);
//        Thread.sleep(3000);
//        driver.close();
//
//        }
//
//        }
//        
	}
        

}

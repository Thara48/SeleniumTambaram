package class070423;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicClass1Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//startup or invoke up the chrome
		// also ChromeDriver driver = new ChromeDriver - is also right way to declare.
        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%20%27%7C&placement=&creative=589460569849&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061908%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwxMmhBhDJARIsANFGOStZVRu-8oaq-Sjibke4cOsoz50yOBtSiDXKclYyEXVTY3K0mLTuGsMaAjOTEALw_wcB");
//		Thread.sleep(3000);
//		driver.close();
//        
//        System.out.println(driver.getCurrentUrl());
//        driver.getTitle();  //tabla irukaa name- note outer of the chrome page.
//        System.out.println(driver.getTitle());
        //driver.get pagesource
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().refresh();
        System.out.println("FB Page refreshed");
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        
        driver.navigate().back();
        System.out.println("navigated back");
        Thread.sleep(3000);
        driver.navigate().forward();
        System.out.println("Navigated forward");
        Thread.sleep(3000);
        
        driver.manage().window().maximize();// browser gets maximized - viseversa for minimized.
        //driver.manage().window(TAB.windows);
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(3000);
        driver.get("https://www.purplle.com/track?campaign=GS_Google_Sok_Search_Brand_Misspell&redirect=https%3A%2F%2Fwww.purplle.com%2F&dpl=1&gclid=EAIaIQobChMIrd2hqeag_gIVjXwrCh1MOwi6EAAYASAAEgL4v_D_BwE");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.close();//current tabs gets closed
        driver.quit(); //all tabs gets closed
       

	}

}

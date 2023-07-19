package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// Collection - upcasting
        //driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=EAIaIQobChMI94y2ru-0_gIVVpJmAh1qoAv0EAAYASAAEgJjVfD_BwE");
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement CreateAcc = driver.findElement(By.xpath("//*[@id=\"u_0_0_Of\"]"));
        CreateAcc.click();
        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"u_l_b_Jc\"]"));
        FirstName.sendKeys("Thara");
        WebElement LastName =driver.findElement(By.xpath("//*[@id=\"u_l_d_Mc\"]"));
        LastName.sendKeys("KJ");
        WebElement Mob = driver.findElement(By.xpath("//*[@id=\"u_l_g_h8\"]"));
        Mob.sendKeys("8754925351");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
        password.sendKeys("ShaliniKoushal48@99");
        WebElement DayDrop = driver.findElement(By.xpath("//*[@id=\"day\"]"));
        DayDrop.click();
        

	}

}

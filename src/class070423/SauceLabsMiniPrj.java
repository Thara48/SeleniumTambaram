package class070423;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabsMiniPrj {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.getTitle();
        Thread.sleep(3000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(3000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("shopping_cart_container")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("continue-shopping")).click();
        Thread.sleep(3000);
        WebElement cart = driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
        cart.click();
        Thread.sleep(3000);
        WebElement cart2 = driver.findElement(By.id("shopping_cart_container"));
        cart2.click();
        Thread.sleep(3000);
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        Thread.sleep(3000);
        //Xpath - introduced.
        WebElement checkoutdetailsname = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input"));
        checkoutdetailsname.sendKeys("Radha");
        System.out.println("got you");
        Thread.sleep(3000);
        
        
        

	}

}

package sprint1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--guest");
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait

		driver.get("https://www.saucedemo.com/");
		WebElement Title = driver.findElement(By.className("login_logo"));
		System.out.println(Title.getText());
		
		WebElement User_name = driver.findElement(By.id("user-name"));
		User_name.sendKeys("standard_user");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100)); --- implicit wait---

		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		
		WebElement Login_btn = driver.findElement(By.name("login-button"));
		Login_btn.click();
		
	WebElement cart = driver.findElement(By.id("shopping_cart_container"));
	if(cart.isDisplayed());{
		System.out.println("Successfully loggedin!!!");
	}
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

}

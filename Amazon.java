import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {

	WebDriver rn;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//chromedriver//chromedriver.exe");
		
		rn=new ChromeDriver();
		
		rn.manage().window().maximize();
		
		rn.manage().deleteAllCookies();
		
	}

	@Test
	public void tc1()
	{
		rn.get("https://www.amazon.in/");
		
		rn.findElement(By.id("twotabsearchtextbox")).sendKeys("Boat SmartWatch");
		
		rn.findElement(By.id("nav-search-submit-button")).click();
		
		System.out.println(rn.getCurrentUrl());
		
		System.out.println("-----------------------------");
		
		System.out.println(rn.getTitle());
		
		System.out.println("-----------------------------");
		
		System.out.println(rn.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div")).getText());
		
		System.out.println("-----------------------------");
		
	}
	
		
	@AfterMethod
	public void tearDown()
	{
		rn.close();
	}
	
	
	
	
}

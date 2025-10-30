import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerification {
	
	static WebDriver driver;
	
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
	public void login() {
		//finding a single web element
		
				driver.findElement(By.name("userName")).sendKeys("epshiba");
				WebElement username=driver.findElement(By.name("userName"));
				username.sendKeys("mercury");
				username.clear();
				username.sendKeys("frozen");
				
				WebElement password=driver.findElement(By.name("password"));
				password.sendKeys("anubasker");
				
				WebElement submit=driver.findElement(By.name("submit"));
				submit.click();	
	}
	
	public void getLinks() {
		//it will go to the register text which takes you the register page we 
		//are using click to open that page
		
		//driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.partialLinkText("Flights")).click();
	}
	
	public void xpathLogin() {
	
//		 absolute path /html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[3]/form[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]
//		 relative path : //input[@name='submit']
		
		WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
		username.sendKeys("Elsa");
		WebElement button=driver.findElement(By.xpath("//input[@name='submit']"));
		button.click();
	}
	
	public void getTrip() {
		WebElement flight=driver.findElement(By.linkText("Flights"));
		flight.click();
		
//		WebElement roundtrip=driver.findElement(By.xpath("//input[@value='roundtrip']"));
//		roundtrip.click();
		
//		WebElement oneway=driver.findElement(By.xpath("//input[@value='oneway']"));
//		oneway.click();
		
		WebElement radios=driver.findElement(By.xpath("//input[@name='tripType'][2]"));
		radios.click();
		
	}
	
	public void getFlights() {
		WebElement flights=driver.findElement(By.xpath("//a[normalize-space()='Flights']"));
		flights.click();
		
	}
	
	
	
	public static void main(String[] args) {
		
		LoginVerification loginverification =new LoginVerification();
		loginverification.setUp();
		
//		String url=driver.getCurrentUrl();
//		String title=driver.getTitle();
//		System.out.println(title);
//		System.out.println(url);
//		String clienturl="https://demo.guru99.com/test/newtours/";
//		
//		if(clienturl.equals(url)) {
//			System.out.println("Successfully Launched");
//		}else {
//			System.out.println("Launch failed");
//		}
		
		
//		loginverification.login();
//		loginverification.getLinks();
		
		//loginverification.xpathLogin();
		//loginverification.getTrip();
		loginverification.getFlights();
		
		
		
	}
	
	

}

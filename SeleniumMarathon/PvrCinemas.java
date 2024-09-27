package SeleniumMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.pvrcinemas.com/");
	driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
	driver.findElement(By.xpath("//span[contains(text(),'INOX Prozone Mall,Saravanampatty')]")).click();
	//Select Your Date as Tomorrow
	driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
	//Select Your Movie
	driver.findElement(By.xpath("(//span[text()='LUBBER PANDHU'])[2]")).click();
	Thread.sleep(2000);
	//Select Your Show Time
	driver.findElement(By.xpath("//span[contains(text(),'12:25 PM')]")).click();
	//Click on Book Button
	driver.findElement(By.xpath("//span[text()='Book']")).click();
	//Click Accept on Term and Condition
	driver.findElement(By.xpath("//button[text()='Accept']")).click();
	//Click any one available seat
	driver.findElement(By.xpath("//span[@id='CL.CLUB|K:17']")).click();
	//print seat number
	WebElement seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']"));
	System.out.println("Seat Number is :" + seatNumber.getText());
	//Click Proceed Button
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	//Print the Seat info under book summary
	WebElement seatInfo = driver.findElement(By.xpath("//div[@class='seat-info']"));
	System.out.println("Print the Seat info : " + seatInfo.getText());
	//Print the grand total under book summary
	WebElement grandTotal = driver.findElement(By.xpath("(//span[text()='221.46'])[2]"));	
	System.out.println("Grand Total is : " + grandTotal.getText());	
	//Click Proceed Button
	driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	//Close the popup
	driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
	//Print Your Current Page title
	String currentPageTitle = driver.getTitle();
	System.out.println("Current Page Title is : " + currentPageTitle);
	//Close Browser
	driver.close();

}

	
    
	}



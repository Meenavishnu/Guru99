package Tutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium10 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alt=driver.switchTo().alert();
		String a=alt.getText();
		System.out.println(a);
		alt.accept();
		driver.findElement(By.id("promtButton")).click();
		Alert alt1=driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.sendKeys("Meena");
		System.out.println(alt1.getText());
		

	}

}

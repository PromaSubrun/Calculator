
package project.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class StandardCalculator extends DriverSetUp{
	
	public static String url="https://calculator.com/";
	
	@Test
	public static void Nagad() throws InterruptedException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//div[contains(text(),'=')]")).click();
		Thread.sleep(1000);
	}
		
		private final Calculator calculator = new Calculator();

	    @Test
	    
	private static void addition() {
		// TODO Auto-generated method stub
		
			assertEquals(2, calculator.add(1, 1));
		
	}

	

	
}

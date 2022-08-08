package project.Calculator;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class SiteVisit extends DriverSetUp{
	
	public static String url="https://calculator.com/";
	
	@Test
	public static void Nagad() throws InterruptedException {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		
	}
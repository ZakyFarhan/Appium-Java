package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ToDoListTest {

	static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			openToDoList();
			
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}

	}
	
public static void openToDoList() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "M2102J20SG");
		cap.setCapability("udid", "e9c3c4f2");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11 RKQ1 200826 002");
		
		cap.setCapability("appPackage", "com.splendapps.splendo");
		cap.setCapability("appActivity", "com.splendapps.splendo.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		System.out.println("Application Started....");
		//Test Case 1
		MobileElement btnCeklis = driver.findElement(By.id("com.splendapps.splendo:id/fabAddTask"));
		btnCeklis.click();
		Thread.sleep(2000);
		
		MobileElement btnEnter = driver.findElement(By.id("com.splendapps.splendo:id/edtTaskName"));
		btnEnter.sendKeys("Testing");
		
		MobileElement btnCalender = driver.findElement(By.id("com.splendapps.splendo:id/btnSetD"));
		btnCalender.click();
		
		MobileElement setTgl = driver.findElement(By.xpath("//*[@content-desc='04 October 2021']"));
		setTgl.click();
		
		MobileElement btnOkeTgl = driver.findElement(By.id("android:id/button1"));
		btnOkeTgl.click();
		
		MobileElement btnTime = driver.findElement(By.id("com.splendapps.splendo:id/btnSetT"));
		btnTime.click();
		
		Thread.sleep(1000);
		MobileElement btnOkeTime = driver.findElement(By.id("android:id/button1"));
		btnOkeTime.click();
		
		MobileElement btnOkeTaks = driver.findElement(By.id("com.splendapps.splendo:id/fabSaveTask"));
		btnOkeTaks.click();
		Thread.sleep(2000);
		
		
		
			//Test Case 2
			MobileElement btnCeklis2 = driver.findElement(By.id("com.splendapps.splendo:id/fabAddTask"));
			btnCeklis2.click();
			Thread.sleep(2000);
				
			MobileElement btnEnter2 = driver.findElement(By.id("com.splendapps.splendo:id/edtTaskName"));
			btnEnter2.sendKeys("Testing-2");
			
			MobileElement btnCalender2 = driver.findElement(By.id("com.splendapps.splendo:id/btnSetD"));
			btnCalender2.click();
			
			Thread.sleep(1000);
			MobileElement setTgl2 = driver.findElement(By.xpath("//*[@content-desc='05 October 2021']"));
			setTgl2.click();
			
			Thread.sleep(1000);
			MobileElement btnOkeTgl2 = driver.findElement(By.id("android:id/button1"));
			btnOkeTgl2.click();
			
			MobileElement btnTime2 = driver.findElement(By.id("com.splendapps.splendo:id/btnSetT"));
			btnTime2.click();
			
			Thread.sleep(1000);
			MobileElement btnOkeTime2 = driver.findElement(By.id("android:id/button1"));
			btnOkeTime2.click();
			
			Thread.sleep(1000);
			MobileElement btnRepeat = driver.findElement(By.id("com.splendapps.splendo:id/spinnerRepeat"));
			btnRepeat.click();
			
			Thread.sleep(1000);
			MobileElement setRepeat = driver.findElement(By.xpath("//android.widget.TextView[@text='Once a Week']"));
			setRepeat.click();
			
			MobileElement btnOkeTaks2 = driver.findElement(By.id("com.splendapps.splendo:id/fabSaveTask"));
			btnOkeTaks2.click();
			Thread.sleep(1000);
				
					//Test Case 3
					MobileElement btnCeklis3 = driver.findElement(By.id("com.splendapps.splendo:id/fabAddTask"));
					btnCeklis3.click();
					Thread.sleep(2000);
					
					MobileElement btnEnter3 = driver.findElement(By.id("com.splendapps.splendo:id/edtTaskName"));
					btnEnter3.sendKeys("Testing-3");
					
					MobileElement btnCalender3 = driver.findElement(By.id("com.splendapps.splendo:id/btnSetD"));
					btnCalender3.click();
					
					Thread.sleep(1000);
					MobileElement setTgl3 = driver.findElement(By.xpath("//*[@content-desc='08 October 2021']"));
					setTgl3.click();
					
					MobileElement btnOkeTgl3 = driver.findElement(By.id("android:id/button1"));
					btnOkeTgl3.click();
					
					MobileElement btnTime3 = driver.findElement(By.id("com.splendapps.splendo:id/btnSetT"));
					btnTime3.click();
					
					Thread.sleep(1000);
					MobileElement btnOkeTime3 = driver.findElement(By.id("android:id/button1"));
					btnOkeTime3.click();
					
					Thread.sleep(1000);
					MobileElement btnRepeat2 = driver.findElement(By.id("com.splendapps.splendo:id/spinnerRepeat"));
					btnRepeat2.click();
					
					Thread.sleep(1000);
					MobileElement setRepeat2 = driver.findElement(By.xpath("//android.widget.TextView[@text='Once a Month']"));
					setRepeat2.click();
					
					Thread.sleep(1000);
					MobileElement btnAddToList = driver.findElement(By.id("com.splendapps.splendo:id/spinnerLists"));
					btnAddToList.click();
					
					Thread.sleep(1000);
					MobileElement setAddToList = driver.findElement(By.xpath("//android.widget.TextView[@text='Personal']"));
					setAddToList.click();
					
					Thread.sleep(1000);
					MobileElement btnOkeTaks3 = driver.findElement(By.id("com.splendapps.splendo:id/fabSaveTask"));
					btnOkeTaks3.click();
					
						//Test Case 4
					MobileElement btnCentang1 = driver.findElement(By.id("com.splendapps.splendo:id/checkDone"));
					btnCentang1.click();
					Thread.sleep(1000);
					
					MobileElement btnCentang2 = driver.findElement(By.id("com.splendapps.splendo:id/checkDone"));
					btnCentang2.click();
					Thread.sleep(1000);
					
					MobileElement btnCentang3 = driver.findElement(By.id("com.splendapps.splendo:id/checkDone"));
					btnCentang3.click();
					Thread.sleep(1000);
		
		
	}

}

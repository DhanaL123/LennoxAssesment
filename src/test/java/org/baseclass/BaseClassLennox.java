package org.baseclass;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor;

public class BaseClassLennox {
	
	
public static	 WebDriver driver;
public static File file;
public static Workbook book;
public static Sheet sheet;


	public static  void lanuchBrower() {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse-workspace\\SeleniumProject\\updatadriver\\chromedriver_mac64_m1\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	public static  void lanuchURL(String url) {
		driver.get(url);
		}
	public static void SendData(WebElement ele,String data) {
		ele.sendKeys(data);

	}
	
	public static  void clickButton(WebElement ele) {
		ele.click();
		}
	public static void implicitiWait() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}	
	
	public static  void otherclick(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ele);
	}
	
	
public static String readfromexcel(int rowNo, int cellNo) throws IOException {
	
		
		
		
		file=new File("F:\\eclipse-workspace\\AssessmentLennox\\ExcelData\\Lennox-data.xlsx");
		//2.read from a file ------------>file input stream 
		FileInputStream fileInputStream=new FileInputStream(file);
		book=new XSSFWorkbook(fileInputStream);
		Sheet sheet=book.getSheet("web-access");
		Row row=sheet.getRow(rowNo);
		Cell cell=row.getCell(cellNo);
		int type = cell.getCellType();
		String name="";
		if (type==1) {
			name = cell.getStringCellValue();
		}
		else {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
				name= dateFormat.format(d);
			} 

			else {
				double d = cell.getNumericCellValue();
				long lo=(long)d;
				name = String.valueOf(lo);

			}
		}

		return name;
	}
public static  void ScrolDown(WebElement ele) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",ele);
}



public static  void keydownpress() throws AWTException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	

}

public static  void TakeScreenshot() throws IOException {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
	File des=new File("F:\\eclipse-workspace\\AssessmentLennox\\ScreeShot\\123.png");
	FileUtils.copyFile(scr, des);
	
}

public static  void waitTime() throws InterruptedException {
	Thread.sleep(100000);
	
	

}



	
	
	

}


	
	
	
	
	















		
		
		
		


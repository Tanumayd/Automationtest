package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshotCode
{
	
	public static void captureScreenshot(WebDriver driver , String ssname) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Selenium_class\\Automation_Test\\Screenshot\\"+ssname+".png"));
	}

}

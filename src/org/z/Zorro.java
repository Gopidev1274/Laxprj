package org.z;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zorro {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\LAX\\driver\\chromedriver.exe");
		WebDriver dev = new ChromeDriver();
		dev.get("https://www.youtube.com");
		TakesScreenshot tk = (TakesScreenshot) dev;
		File dev1 = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(dev1);
		File dev2 = new File("C:\\Users\\ELCOT\\Desktop\\Screeenshot\\dev2.jpg");
		FileUtils.copyFile(dev1, dev2);
		dev.manage().window().maximize();
		dev.quit();
	}
}

package org.z;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zorro {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\LAX\\driver\\chromedriver.exe");
	WebDriver dev=new ChromeDriver();
	dev.get("https://www.youtube.com");
	dev.manage().window().maximize();
	System.out.println("success");
	dev.quit();
}
}

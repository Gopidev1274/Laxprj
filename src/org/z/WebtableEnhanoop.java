package org.z;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableEnhanoop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\LAX\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
	for (WebElement x : tRow) {
		List<WebElement> datas = driver.findElements(By.tagName("td"));
	for (WebElement x1 : datas) {
		System.out.println(x1.getText());
	}}}}

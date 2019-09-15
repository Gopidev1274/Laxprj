package org.z;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\GopiDeva\\LAX\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRow.size(); i++) {
			WebElement tRows = tRow.get(i);
			List<WebElement> tDatas = tRows.findElements(By.tagName("td"));
			for (int j = 0; j < tDatas.size(); j++) {
				WebElement tData = tDatas.get(j);
				String text = tData.getText();
				System.out.println(text);
			}}}}

package com.automation.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createalert {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/search?q=mindq&oq=mindq&aqs=chrome..69i57j0l5.3335j0j4&sourceid=chrome&ie=UTF-8");
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("Window.confirm('selenium')");
	}

}

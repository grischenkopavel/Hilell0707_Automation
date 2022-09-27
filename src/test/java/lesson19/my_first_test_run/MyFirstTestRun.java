package lesson19.my_first_test_run;/*
Created by Pavel Gryshchenko on 26.09.2022
*/

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTestRun {
    private WebDriver driver;

    @BeforeTest
    public void setUpTest()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void firstRun(){
        driver.get("https://www.google.com.ua/");
    }
}

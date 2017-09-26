package tests.i;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class uaTest {

    private WebDriver driver;
    private WebElement login;
    private WebElement password;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void goToIUA (String log, String pass){

    }

}

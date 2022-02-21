package suitePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngActivity3 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMtd()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void loginPage()
    {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();

        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();

        Assert.assertEquals("Welcome Back, admin", loginMessage);

    }

    @AfterMethod
    public void afterMtd()
    {
        driver.quit();
    }

}

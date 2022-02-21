package suitePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestngActivity7 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMtd()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test (dataProvider = "Authentication")
    public void paramExample(String username, String password )
    {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }

    @AfterMethod
    public void afterMtd()
    {
        driver.quit();
    }
}

package suitePackage;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngActivity1 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMtd()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }

    @Test
    public void testcase1()
    {
        System.out.println("page title is : "+driver.getTitle());
        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterMethod
    public void afterMtd()
    {
        driver.close();
    }

}

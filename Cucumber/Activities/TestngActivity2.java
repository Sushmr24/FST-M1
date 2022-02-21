package suitePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngActivity2 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMtd()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void testcase1()
    {
        System.out.println("page title is : "+driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Target Practice");
    }

    @Test
    public void testcase2()
    {
        String color = driver.findElement(By.cssSelector("button.black")).getText();
        Assert.assertEquals(color, "black");

    }

    @Test(enabled = false)
    public void testcase3()
    {
        System.out.println("page title is : "+driver.getTitle());
        driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @Test
    public void testcase4()
    {
       throw new SkipException("Skipping testing ");
    }


    @AfterMethod
    public void afterMtd()
    {
        driver.quit();
    }
}

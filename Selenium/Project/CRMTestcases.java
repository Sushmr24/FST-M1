package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class CRMTestcases {
    WebDriver driver;
    String title ;
    String imageUrl;
    String copyrightText;
    WebElement username;
    WebElement pwd;
    WebDriverWait wait ;


    @Given("^open the browser$")
    public void open_the_browser()
    {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    }


    @When("^Navigate to \"(.*)\"$")
    public void navigate_to_url(String url)
    {
        driver.get(url);
    }

    @Then("^Get the title of the website$")
    public void get_the_title_of_the_website()
    {
        title = driver.getTitle();
        System.out.println("title is : "+title);
    }

    @And("^Make sure it matches \"(.*)\" exactly$")
    public void make_sure_it_matches(String expectedTitle)
    {
        Assert.assertEquals(expectedTitle,title);
    }

    @Then("^Get the url of the header image$")
    public void get_the_url_of_the_header_image()
    {
        imageUrl= driver.findElement(By.xpath("//div[@class='companylogo']/img")).getAttribute("src");
    }

    @And("^Print the url to the console$")
    public void print_the_url_to_the_console()
    {
        System.out.println("Image Url is : "+imageUrl);
    }

    @Then("^Get the first copyright text in the footer$")
    public void get_the_first_copyright_text_in_the_footer()
    {
        copyrightText = driver.findElement(By.id("admin_options")).getText() ;
    }

    @And("^Print the text to the console$")
    public void print_the_text_to_the_console()
    {
        System.out.println("Copy right text is : " + copyrightText);
    }

    @Then("^Find and select the username and password fields$")
    public void find_and_select_the_username_and_password_fields()
    {
        username = driver.findElement(By.id("user_name"));
        pwd = driver.findElement(By.id("username_password"));

    }

    @And("^Enter login credentials into the respective fields$")
    public void enter_login_credentials_into_the_respective_fields()
    {
        username.sendKeys("admin");
        pwd.sendKeys("pa$$w0rd");
    }

    @Then("^Click login$")
    public void click_login()
    {
        driver.findElement(By.id("bigbutton")).click();
    }

    @And("^Verify that the homepage has opened$")
    public void verify_that_the_homepage_has_opened()
    {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("Home"));
    }

    @Then("^Login with credentials$")
    public void login_with_credentials()
    {
        find_and_select_the_username_and_password_fields();
        enter_login_credentials_into_the_respective_fields();
        click_login();
    }

    @And("^Get the color of the navigation menu and print it to the console$")
    public void get_the_color_of_the_navigation_menu_and_print_it_to_the_console()
    {
        System.out.println("Background color is : "+driver.findElement(By.className("navbar-brand-container")).getCssValue("color"));
    }

    @And("^Locate the navigation menu and Ensure that the \"(.*)\" menu item exists$")
    public void locate_the_navigation_menu_and_ensure_that_the_menu_item_exists(String menuName)
    {
        List<WebElement> elements = driver.findElements(By.cssSelector(".dropdown-toggle.grouptab"));
        boolean flag = false;
        for(WebElement ele : elements)
        {
            if(menuName.equalsIgnoreCase(ele.getText()))
            {
                flag = true;
                break;
            }
        }
        Assert.assertTrue(flag);

    }


    @And("^Navigate to Sales and Leads$")
    public void navigate_to_sales_and_leads() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.cssSelector("a#moduleTab_9_Leads")).click();
    }

    @Then("^In the table find the Additional information icon at the end of the row of the lead information and Click it$")
    public void in_the_table_find_the_additional_info_and_click_it() throws InterruptedException {
       //Thread.sleep(3000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab > span:nth-child(1)")));
       driver.findElement(By.cssSelector("#adspan_683f9f93-9423-1a6e-4a4d-5fd8a89ceaab > span:nth-child(1)")).click();
    }

    @And("^Read the popup and print the phone number displayed in it$")
    public void read_the_popup_and_print_the_phone_number_displayed_in_it()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("phone")));
        System.out.println(driver.findElement(By.className("phone")).getText());

    }

    @And("^Navigate to the Sales and Accounts page$")
    public void navigate_to_the_sales_and_accounts_page() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("grouptab_0")).click();
        driver.findElement(By.cssSelector("a#moduleTab_9_Accounts")).click();
    }

    @Then("^Find the table on the page and print the names of the first 5 odd-numbered rows of the table to the console$")
    public void find_the_table_and_print_the_names_of_odd_numbered()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("moduleTitle")));
        List<WebElement> elements = driver.findElements(By.xpath("//td[@class=' inlineEdit' and @field='name']//a"));
        System.out.println("============================================");

        System.out.println(elements.get(0).getText());
        int count = 1;
        for (int i=1; i<= elements.size();i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(elements.get(i).getText());
                count++;
            }
            if (count == 5)
            {
                break;
            }
        }
        System.out.println("============================================");
    }

    @Then("^Find the table on the page and print the first 10 values in the Name column and the User column of the table to the console$")
    public void find_the_table_print_the_name_and_the_user_name()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("moduleTitle")));
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr"));
        String name = "";
        String uName = "";
        int count = 0;

        System.out.println("============================================================");

        for (int i = 1; i <= rows.size(); i++)
        {
            List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'table-responsive')]/tbody/tr["+i+"]/td"));

            for (WebElement col : cols)
            {
                String fieldName = col.getAttribute("field");
                if(fieldName != null) {
                    if (fieldName.equals("name")) {
                        name = col.getText();
                    }
                if (fieldName.equals("assigned_user_name")) {
                        uName = col.getText();
                    }
                }
            }
            System.out.println("Name is : "+name +" Uname is : "+uName);
            count++;
            if (count == 10)
            {
                break;
            }
        }
        System.out.println("============================================================");

    }

    @Then("^close the browser$")
    public void close_the_browser()
    {
        driver.quit();
    }
}

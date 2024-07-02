package com.amol;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class SeleniumTest {
   public static WebDriver driver;
   public static ExtentReports report;
   public static ExtentTest test;
    ExtentReports extent = new ExtentReports();

    @BeforeSuite
    void setUp() {

        // Report
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark-report.html");
        extent.attachReporter(spark);
        // [+] let try to launch the browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // set the system property
        // https://googlechromelabs.github.io/chrome-for-testing/#stable
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

    }

    public static String captureSnapshot(WebDriver webDriver) throws IOException {
        File snapFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File saved = new File("src/../snapshot/"+System.currentTimeMillis()+".png");
        String errflpath = saved.getAbsolutePath();
        FileUtils.copyFile(snapFile,saved);
        return errflpath;
    }

    @Test
    void test_steps() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("sa");
        driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("sa");

        driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();

        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
        String actualFirstCategory = webElement.getText();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"menu\"]/a/li")).click();

        String expectedFirstCategory = "Formal Shoes";
        System.out.println("expected shoes category: "+expectedFirstCategory);
        System.out.println("actual shoes category: "+actualFirstCategory);
        Assert.assertEquals(expectedFirstCategory, actualFirstCategory);

   }

   @Test
   void validateTitles_OnlineProducts() throws InterruptedException, IOException {
       test = extent.createTest("Validate Shoes Title On Product Page",
               "This test validates that the different shoes categories are correct on online product page");

        Pages.click_hamburg_menu();
        Thread.sleep(500);
        Pages.click_orderProducts_link();
        ProductsPage.getTitleFormalShoes();
        ProductsPage.getTitleSportShoes();
        ProductsPage.getTitleSneakerShoes();

   }

   @Test
   void verifyFormalShoeFirstName() throws InterruptedException {
       test = extent.createTest("Verify First Name Of Formal Shoes On Product Page",
               "This test validates that the name of first formal shoes  are correct on online product page");

        Pages.click_formalShoes_dropdown();
        Thread.sleep(500);
        ProductsPage.formalShoesFirstShoeName();
   }

   @Test
    void verifySportShoeFirstName() throws InterruptedException, IOException {
       test = extent.createTest("Verify First Name Of Sport Shoes On Product Page",
               "This test validates that the name of first sport shoes  are correct on online product page");

        Pages.click_sportShoes_dropdown();
        Thread.sleep(500);
        ProductsPage.sportShoesFirstShoeName();
    }

    @Test
    void verifySneakerShoeFirstName() throws InterruptedException, IOException {
        test = extent.createTest("Verify First Name Of Sneaker Shoes On Product Page",
                "This test validates that the name of first sneaker shoes  are correct on online product page");

        Pages.click_sneakerShoes_dropdown();
        Thread.sleep(500);
        ProductsPage.sneakerShoesFirstShoeName();

    }

    @AfterSuite
    void cleanup(){
        extent.flush();
        driver.quit();
    }
}

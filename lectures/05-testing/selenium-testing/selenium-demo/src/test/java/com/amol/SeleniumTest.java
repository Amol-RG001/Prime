package com.amol;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
   public static WebDriver driver;

    @BeforeTest
    void setUp(){

        // [+] let try to launch the browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // set the system property
        // https://googlechromelabs.github.io/chrome-for-testing/#stable
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        driver =  new ChromeDriver(options);
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
       // driver.quit();


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

        String expectedFirstCategory = "Formal Shoes";
        System.out.println("expected shoes category: "+expectedFirstCategory);
        System.out.println("actual shoes category: "+actualFirstCategory);
        Assert.assertEquals(expectedFirstCategory, actualFirstCategory);

        driver.close();
   }

   @Test
   void validateTitles_OnlineProducts() throws InterruptedException {
        Pages.click_hamburg_menu();
        Thread.sleep(500);
        Pages.click_orderProducts_link();

        ProductsPage.getTitleFormalShoes();
        Thread.sleep(200);
        ProductsPage.getTitleSportShoes();
        Thread.sleep(200);
        ProductsPage.getTitleSneakerShoes();

        driver.close();
   }

   @Test
   void verifyFormalShoeFirstName() throws InterruptedException {
        Pages.click_formalShoes_dropdown();
        Thread.sleep(500);
        ProductsPage.formalShoesFirstShoeName();
        driver.close();

   }

   @Test
    void verifySportShoeFirstName() throws InterruptedException {
        Pages.click_sportShoes_dropdown();
        Thread.sleep(500);
        ProductsPage.sportShoesFirstShoeName();
        driver.close();
    }

    @Test
    void verifySneakerShoeFirstName() throws InterruptedException {
        Pages.click_sneakerShoes_dropdown();
        Thread.sleep(500);
        ProductsPage.sneakerShoesFirstShoeName();
        driver.close();
    }
}

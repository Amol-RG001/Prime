package com.amol;

import org.openqa.selenium.By;
import org.testng.Assert;

import static com.amol.SeleniumTest.driver;

public class ProductsPage {

    public static String formalShoes_xpath = "/html/body/div[2]/center/h2";
    public static String sportShoes_xpath = "/html/body/div[3]/center/h2";

    public static String sneakerShoes_xpath = "/html/body/div[4]/center/h2";

    public static String formalShoesDropdown_xpath  = "/html/body/div[2]/center/div/i[1]";
    public static String SportShoesDropdown_xpath  ="/html/body/div[3]/center/div/i[1]";
    public static String SneakerShoesDropdown_xpath  ="/html/body/div[4]/center/div/i[2]";

    public static String formalShoesFirstShoeName_xpath = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String sportShoesFirstShoeName_xpath = "/html/body/div[3]/table/tbody/tr[1]/td[1]";
    public static String sneakerShoesFirstShoeName_xpath = "/html/body/div[4]/table/tbody/tr[1]/td[1]";
    public static void formalShoesFirstShoeName(){

        String expectedFirstShoeName = "   Classic Cheltenham";
        String actualFirstShoeName = driver.findElement(By.xpath(formalShoesFirstShoeName_xpath)).getText();
        Assert.assertEquals(expectedFirstShoeName,actualFirstShoeName);
        System.out.println("expectedFirstShoeName: "+expectedFirstShoeName);
        System.out.println("actualFirstShoeName: "+actualFirstShoeName);

    }

    public static void sportShoesFirstShoeName(){
        String expectedFirstShoeName = "   Ultimate";
        String actualFirstShoeName = driver.findElement(By.xpath(sportShoesFirstShoeName_xpath)).getText();
        Assert.assertEquals(expectedFirstShoeName,actualFirstShoeName);
        System.out.println("expectedFirstShoeName: "+expectedFirstShoeName);
        System.out.println("actualFirstShoeName: "+actualFirstShoeName);

    }

    public static void sneakerShoesFirstShoeName(){
        String expectedFirstShoeName = "   Archivo";
        String actualFirstShoeName = driver.findElement(By.xpath(sneakerShoesFirstShoeName_xpath)).getText();
        Assert.assertEquals(expectedFirstShoeName,actualFirstShoeName);
        System.out.println("expectedFirstShoeName: "+expectedFirstShoeName);
        System.out.println("actualFirstShoeName: "+actualFirstShoeName);

    }
    public static void getTitleFormalShoes(){
        String expectedTitle = "Formal Shoes";
        String actualTitle =  driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("expectedTitle: "+expectedTitle);
        System.out.println("actualTitle: "+actualTitle);

    }
    public static void getTitleSportShoes(){
        String expectedTitle = "Sports Shoes";
        String actualTitle =  driver.findElement(By.xpath(sportShoes_xpath)).getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("expectedTitle: "+expectedTitle);
        System.out.println("actualTitle: "+actualTitle);
    }
    public static void getTitleSneakerShoes(){
        String expectedTitle = "Sneakers";
        String actualTitle =  driver.findElement(By.xpath(sneakerShoes_xpath)).getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("expectedTitle: "+expectedTitle);
        System.out.println("actualTitle: "+actualTitle);
    }
}

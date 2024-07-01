package com.amol;

import org.openqa.selenium.By;

import static com.amol.SeleniumTest.driver;

public class Pages {
    public static String hamburg_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String online_product_option = "//*[@id=\"menu\"]/a[3]/li";
    public static String formalShoe_dropdown = "/html/body/div[2]/center/div/i[1]";
    public static String sportShoe_dropdown = "/html/body/div[3]/center/div/i[1]";
    public static String sneakerShoe_dropdown = "/html/body/div[4]/center/div/i[1]";

    public static void click_hamburg_menu(){
        driver.findElement(By.xpath(hamburg_menu_xpath)).click();
    }

    public static void click_orderProducts_link(){
        driver.findElement(By.xpath(online_product_option)).click();
    }

    public static void click_formalShoes_dropdown(){
        driver.findElement(By.xpath(formalShoe_dropdown)).click();
    }

    public static void click_sportShoes_dropdown(){
        driver.findElement(By.xpath(sportShoe_dropdown)).click();
    }

    public static void click_sneakerShoes_dropdown(){
        driver.findElement(By.xpath(sneakerShoe_dropdown)).click();
    }
}
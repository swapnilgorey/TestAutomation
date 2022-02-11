package com.practiceautomation.StepDef;

import com.practiceautomation.Utility.PropertiesFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.util.Properties;

public class TestCasesStepDef {
    public static WebDriver driver;
    static PropertiesFileReader prop= new PropertiesFileReader();


    @Given("^User launches Browser$")
    public static void openBrowser() throws Throwable{
        Properties properties= prop.getProperty();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("testurl"));

    }
    @And("^Launches youtube website$")
    public static void launchYoutube() throws Throwable{
        String title = driver.getTitle();
//        System.out.println(title);
        if (title.equalsIgnoreCase("YouTube")){
            Assert.assertTrue(true);
        }
        else{
            Assert.assertTrue(false);
        }
    }

    @When("^Enters text in Search Field \"([^\\\"]*)\"$")
    public static void searchVideo(String text) throws Throwable{
        try{
            WebElement ele = driver.findElement(By.xpath("//input[@id='search']"));
            ele.click();
            ele.sendKeys(text);
            WebElement ele1 = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
            ele1.click();
        }
        catch(Exception e){
            System.out.println("Something wrong happend while finding element");
        }
    }
    @Then("^Related Videos should be displayed$")
    public static void verifyVideo() throws Throwable{
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.xpath("//*[@class='style-scope ytd-video-renderer' and text()='Mora siayyan.wmv']"));
        if (ele.isDisplayed()){
            ele.click();
            System.out.println("Playing Your Video");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("Error Occured while playing video");
            Assert.assertTrue(false);
        }
        Thread.sleep(10000);
    }

    @Then("^Quit browser Session$")
    public static void tearDown(){
        driver.quit();
    }
}

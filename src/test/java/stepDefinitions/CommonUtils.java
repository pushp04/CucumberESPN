package stepDefinitions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;


public class CommonUtils extends BaseClass{
    public static WebDriver driver ;
    public static WebDriverWait wait;



    public static WebDriver getDriver() {
        if(driver == null || driver.toString().contains("(null)")) {
            driver=new ChromeDriver();
        }
        return driver;
    }



    public static void setDriver(WebDriver driver) {
        CommonUtils.driver = driver;
    }

    public static void setWebDriverWait(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public static WebDriverWait getWait() {
        return wait;
    }
    public static FluentWait <WebDriver>getFluentWait() {
        return new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);
    }


    public static String getFullPath(String filePath) {
        Path p = Paths.get(System.getProperty("user.dir"))
                .resolve(filePath);
        return p.toString();
    }

    public static String takeScreenshot(WebDriver driver) {
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot, new File("E:\\com.test\\screenshots\\"+"screenshot.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "E:\\com.test\\screenshots\\"+"screenshot.png";
    }

    public static void jsClick(WebElement element) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void quitDriver(WebDriver driver) {
        driver.close();
    }
}
package stepDefinitions;

import cucumber.api.java.en.*;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.ESPNHomePageRepo;
import pageObjects.LiveScorePageRepo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class MyStepdefs extends BaseClass{

    private final WebDriver driver=CommonUtils.getDriver();
    Set<Integer> rcode=new HashSet<>();

    @Given("User Launch Chrome browser")
    public void user_Launch_Chrome_browser() {
        logger.info("************* Launching Browser *****************");
    }

    @When("entered to the {}")
    public void enteredToThe(String arg0) {
        driver.get(arg0);
    }

    @When("hover over Live Score Button")
    public void hoverOverLiveScoreButton() {
        ESPNHomePageRepo pageRepo=new ESPNHomePageRepo(driver);
        Actions actions=new Actions(driver);
        CommonUtils.wait.until(ExpectedConditions.visibilityOf(pageRepo.getLiveScoreButton()));
        actions.moveToElement(pageRepo.getLiveScoreButton()).build().perform();
        logger.info("mouse hover over to the terger element");
    }

    @And("click on Live Scores Home button")
    public void clickOnLiveScoresHomeButton() throws InterruptedException {
        ESPNHomePageRepo pageRepo=new ESPNHomePageRepo(driver);
        Thread.sleep(2000);
        CommonUtils.getFluentWait().until(ExpectedConditions.elementToBeClickable(pageRepo.getLiveScoreHome())).click();
        logger.info("clicked on target element");
    }

    @Then("click the Cricket Schedule button")
    public void clickTheCricketScheduleButton() {
        LiveScorePageRepo pageRepo=new LiveScorePageRepo(driver);
        CommonUtils.wait.until(ExpectedConditions.elementToBeClickable(pageRepo.getCricketSchedule())).click();
    }

    @Then("check todays all links are working")
    public void checkTodaysAllLinksAreWorking() throws IOException {
        LiveScorePageRepo pageRepo=new LiveScorePageRepo(driver);
        List<WebElement> links=pageRepo.getCurrentLinks();
        Iterator<WebElement> it= links.iterator();
        String link;

        while (it.hasNext()){
            link=it.next().getAttribute("href");
            rcode.add(check(link));
        }
        logger.info("Checking for the links are working");
    }
    public int check(String url) throws IOException {
        URL link =new URL(url);
        HttpURLConnection httpURLConnection= (HttpURLConnection) link.openConnection();
        httpURLConnection.setConnectTimeout(3000);
        httpURLConnection.connect();
        return httpURLConnection.getResponseCode();
    }

    @And("assert all link validations {int}")
    public void assertAllLinkValidations(int arg0) {
        Iterator<Integer>it=rcode.iterator();
        while (it.hasNext()) {
            int i=it.next();
            Assert.assertEquals("Status code is " + i, i, arg0);
        }
        logger.info("Validating the result");
    }

    @And("the response code is {int}")
    public void theResponseCodeIs(int arg0) {
        Assert.assertTrue(rcode.contains(arg0));
    }

    @And("close browser")
    public void closeBrowser() {
        logger.info("Initiating browser kill action");
    }
}

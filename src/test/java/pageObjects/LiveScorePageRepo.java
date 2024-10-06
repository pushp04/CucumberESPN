package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LiveScorePageRepo {
    private WebDriver driver;

    public LiveScorePageRepo(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//span[contains(text(),'Cricket Schedule')]/parent::a")
    private WebElement cricketSchedule;

    public WebElement getCricketSchedule() {
        return cricketSchedule;
    }

    public void setCricketSchedule(WebElement cricketSchedule) {
        this.cricketSchedule = cricketSchedule;
    }

    public List<WebElement> getCurrentLinks() {
        return currentLinks;
    }

    public void setCurrentLinks(List<WebElement> currentLinks) {
        this.currentLinks = currentLinks;
    }

    @FindBy(xpath = "(//div[@class='ds-mb-6'])[1]//a")
    private List<WebElement>currentLinks;

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ESPNHomePageRepo {
    private WebDriver driver;

    public ESPNHomePageRepo(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Live Scores')]")
    private WebElement liveScoreButton;

    @FindBy(xpath = "//span[contains(text(),'Live Scores Home')]/parent::a")
    private  WebElement liveScoreHome;


    public WebElement getLiveScoreButton() {
        return liveScoreButton;
    }

    public void setLiveScoreButton(WebElement liveScoreButton) {
        this.liveScoreButton = liveScoreButton;
    }

    public WebElement getLiveScoreHome() {
        return liveScoreHome;
    }

    public void setLiveScoreHome(WebElement liveScoreHome) {
        this.liveScoreHome = liveScoreHome;
    }

}

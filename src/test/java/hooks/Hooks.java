package hooks;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import stepDefinitions.CommonUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class Hooks extends CommonUtils {
    private final WebDriver driver=CommonUtils.getDriver();

    @Before
    public void initialisation() throws IOException {
        setWebDriverWait(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        logger= Logger.getLogger("nopCommerceSDET");
        PropertyConfigurator.configure("Log4j.properties");
        logger.setLevel(Level.DEBUG);
        logger.info("************* Launching Browser *****************");
        //Load properties file
        configProp= new Properties();
        FileInputStream configPropfile = new FileInputStream("config.properties");
        configProp.load(configPropfile);


    }

    @After
    public void teardown(){
        logger.info("************* cloding browser *****************");
        driver.quit();
    }
}

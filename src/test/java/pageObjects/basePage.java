package pageObjects;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


// make this class abstract so we can only inheritate it
// base class that initiate driver and sets up before and after
abstract public class basePage {
    public void setUp(){
        browserFactory.getBrowserDriver("edge");
//        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1248x968";
        Configuration.headless = false;
    }

    @BeforeEach
    public void init(){
        setUp();
    }

    @AfterEach
    public void tearDown(){
        Selenide.closeWebDriver();
    }
}

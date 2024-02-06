package pageObjects;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class browserFactory {
    public static void getBrowserDriver(String browserType){
        switch (browserType) {
            case "chrome":
                setupChrome();
                break;
            case "edge":
                setupEdge();
                break;
            default:
                System.out.println("Not supported browser type");
                break;
        }
    }
    public static void setupChrome() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
    }
    public static void setupEdge() {
        WebDriverManager.edgedriver().setup();
        Configuration.browser = "edge";
    }
}



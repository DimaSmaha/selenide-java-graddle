package pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class dynamicPage extends basePage{
    String baseUrl = "https://demoqa.com/dynamic-properties";
    SelenideElement enableAfterBtn = $("#enableAfter");
    SelenideElement visibleAfterBtn = $("#visibleAfter");


    public void openDynamicPropPage(){
        Selenide.open(baseUrl);
    }

    public void isBtnEnabled(){
        enableAfterBtn.shouldBe(enabled, Duration.ofSeconds(7));
    }

    public void isBtnVisible(){
        visibleAfterBtn.shouldBe(visible, Duration.ofSeconds(7));
    }


}

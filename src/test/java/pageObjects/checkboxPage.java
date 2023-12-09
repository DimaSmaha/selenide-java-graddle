package pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class checkboxPage extends basePage{
    String baseUrl = "https://demoqa.com/checkbox";
    SelenideElement checkbox = $(".rct-checkbox .rct-icon");

    public void openCheckboxPage(){
        Selenide.open(baseUrl);
    }

    public void clickCheckbox(){
        checkbox.click();
    }

    public void isChbChecked(){
        checkbox.shouldHave(attribute("class","rct-icon rct-icon-check"));
    }

}

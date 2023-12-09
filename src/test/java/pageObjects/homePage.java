package pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

//$ for cssSelector, $x for xPath expression
public class homePage extends basePage {
    String baseUrl = "https://demoqa.com/text-box";
    SelenideElement fullNameInput = $("#userName");
   public static SelenideElement submitBtn = $("#submit");
   SelenideElement firstNameNotification = $("#name");

    public void openWebsite(){
        Selenide.open(baseUrl);
    }

    public void fillFirstNameInput(String name){
       fullNameInput.sendKeys(name);
    }

    public void clickElement(SelenideElement element){
        element.click();
    }
    public boolean isFirstNameNotificationDisplayed(){
       return firstNameNotification.isDisplayed();
    }

    public void isFirstNameNotificationVisible(){
       firstNameNotification.shouldBe(visible);
    }

    // there are two ways to assert smth or through Assertions, or through Selenide should, should has own timeouts
}

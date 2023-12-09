package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class webtablesPage extends basePage{
    String baseUrl = "https://demoqa.com/webtables";
    SelenideElement addRecordBtn = $("#addNewRecordButton");
    SelenideElement searchInput = $("#searchBox");
    SelenideElement editBtn3 = $("#edit-record-3");
    SelenideElement firstNameInput = $("#firstName");
    SelenideElement userEmailInput = $("#userEmail");
    SelenideElement submitBtn = $("#submit");
    SelenideElement searchForNewUser = $x("//*[contains(text(),'Dima')]");
    SelenideElement searchedName = $x("//div[@class=\"rt-tr -odd\"]//div[@class=\"rt-td\"][1]");
    public void openWebtablesPage(){
        Selenide.open(baseUrl);
    }

    public void fillSearch(String name){
        submitBtn.shouldNotBe(Condition.visible);
        searchInput.sendKeys(name);
    }

    public void clickEditBtn(){
        editBtn3.shouldBe(Condition.visible);
        editBtn3.click();
    }

    public void fillFirstName(String name){
        firstNameInput.shouldBe(Condition.visible);
        firstNameInput.clear();
        firstNameInput.sendKeys(name);
    }

    public void fillUserEmail(String email){
        userEmailInput.clear();
        userEmailInput.sendKeys(email);
    }

    public void clickSubmitBtn(){
        submitBtn.click();
    }

    public void checkNewUserAdded(){
        searchForNewUser.should(Condition.exist);
    }
    public void checkSearchedName(String text){
        searchedName.shouldBe(Condition.visible);
        searchedName.shouldHave(Condition.text(text));
    }
    //also here in some functions we can check visibility of elements before interract
    //or that some are not visible to avoid obstacles
}

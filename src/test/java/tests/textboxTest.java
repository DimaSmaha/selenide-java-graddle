package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageObjects.homePage;

public class textboxTest extends homePage{

    @Test
    public void firstTextboxTest(){
        openWebsite();
        fillFirstNameInput("Dima");
        clickElement(homePage.submitBtn);
        isFirstNameNotificationVisible();
        Assertions.assertTrue(isFirstNameNotificationDisplayed());

        // there are two ways to assert smth or through Assertions or through selenide should, should has own timeouts
    }
}

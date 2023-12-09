package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class webtablesTest extends pageObjects.webtablesPage{

    @Test
    public void firstWebtablesTest(){
        openWebtablesPage();
        clickEditBtn();
        fillFirstName("Dima");
        fillUserEmail("Dima@gmail.com");
        clickSubmitBtn();
        checkNewUserAdded();
        fillSearch("Alden");
        checkSearchedName("Alden");
    }
}

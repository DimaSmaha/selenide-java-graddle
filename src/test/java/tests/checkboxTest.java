package tests;

import org.junit.jupiter.api.Test;

public class checkboxTest extends pageObjects.checkboxPage{
    @Test
    public void firstCheckboxTest(){
        openCheckboxPage();
        clickCheckbox();
        isChbChecked();
    }
}

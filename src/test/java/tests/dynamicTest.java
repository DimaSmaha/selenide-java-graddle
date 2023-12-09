package tests;

import org.junit.jupiter.api.Test;

public class dynamicTest extends pageObjects.dynamicPage{
    @Test
    public void firstDynamicTest(){
        openDynamicPropPage();
        isBtnEnabled();
        isBtnVisible();
    }
}

package Lecture_10;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FirstAutoTest {

    @Test
    public void autoTest() {
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.browser = "edge";
        open("https://ee.ge/");
        $(byText("რეგისტრაცია")).click();
    }

    @Test
    public void atst() {

    }


    @Test
    public void sfsfsf() {

    }


    @Test
    public void sdsdfsd() {

    }
}

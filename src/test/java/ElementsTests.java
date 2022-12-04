import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ElementsTests {

    public ElementsTests()
    {
        Configuration.timeout = 10000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }

    @BeforeMethod
    public void openLink(){
        open("https://demoqa.com");
    }

    @Test
    public void test1() {
        $(byText("Elements")).click();
        $(byText("Radio Button")).click();

        $(byText("Impressive")).click();
        $(byText("You have selected")).should(appear);
        $(byText("Impressive")).should(appear);
        sleep(1500);
    }

    @Test
    public void test2() {
        $(byText("Elements")).click();
        $(byText("Buttons")).click();
        $(byText("Click Me")).click();
        $(byText("You have done a dynamic click")).should(appear);
        $(byText("Right Click Me")).click();
        $(byText("You have done a right click")).should(appear);
        sleep(1500);
    }
}

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoqaClass {


    @Test
    void demoQA00() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";

        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('footer').remove();");
        executeJavaScript("$('#fixedban').remove();");
        $("input[id='firstName']").setValue("John");
        $("input[id='lastName']").setValue("Doe");
        $("input[id='userEmail']").setValue("a@b.com");
        $("label[for='gender-radio-1']").click();
        $("input[id='userNumber']").setValue("1234567890");
        $("input[id='dateOfBirthInput']").click();
        $("select.react-datepicker__year-select").selectOption("2000");
        $("select.react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__day--007").click();
        $("[id='currentAddress']").sendKeys("My address");
        $("#subjectsInput").click();
        $("#subjectsInput").sendKeys("Hindi");
        $("#subjectsInput").pressEnter();
        $x("//label[contains(text(),'Music')]").click();
        $("[id='uploadPicture']").uploadFromClasspath("img.png");
        $("[id='state']").click();
        $(byText("NCR")).click();
        $("[id='city']").click();
        $(byText("Delhi")).click();
        $("[id='submit']").click();



        $("tbody").shouldHave(Condition.text("Delhi"));
        $("tbody").shouldHave(Condition.text("Music"));
        $("tbody").shouldHave(Condition.text("My address"));
        $("tbody").shouldHave(Condition.text("Delhi"));
    }
}

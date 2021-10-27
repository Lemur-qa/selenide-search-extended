package guru.qa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTests {
    public static class RegistrationTestsAga {

        @BeforeAll
        static void setup() {
            Configuration.baseUrl = "https://demoqa.com";
            Configuration.startMaximized = true;
        }

        @Test
        void positiveFillTests() {
            open("https://demoqa.com/automation-practice-form");
            $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
            $("#gender-radio-3").click();

            $("#userName").setValue("Alex");
            $("#lastName").setValue("Egorov");
            $("#userEmail").setValue("Kitten@qaguru.com");

}}}

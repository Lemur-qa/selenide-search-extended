package guru.qa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void positiveFillTests() {
        open("https://demoqa.com/text-box");
       $("#userName").setValue("Alex");
        $("#userEmail").setValue("Kitten@qaguru.com");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Piter");
        $("#submit").click();

        $("#name").shouldHave(text("Alex"));
        $("#email").shouldHave(text("Kitten@qaguru.com"));
        $("#currentAddress",1).shouldHave(text("Moscow"));
        $("#permanentAddress",1).shouldHave(text("Piter"));
    }
}

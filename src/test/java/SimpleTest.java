import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest {
    @Test
    public void SimpleGoogleSearch() {
        open("https://google.com");

        $("[name=q]").setValue("Selenide");
        $("[name=q]").pressEnter();
//sadas
        $("#rcnt").shouldHave(Condition.text("selenide.org"));
        $("#rcnt").shouldHave(Condition.text("selenide"));

        //Previous comment was commited to the main branch... this one is intended to remove the previous one.
    }
}

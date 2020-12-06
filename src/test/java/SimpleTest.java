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
        // New comment for a new branch
    }
}
git
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
    
     @Test
     void selenideSearchTest() {
         // Открыть yandex
         open("https://yandex.ru");

         // Ввести Selenide в поиска
         $(byName("text")).setValue("Selenide").pressEnter();

         // Проверить, что Selenide появился в результатах поиска
         $("html").shouldHave(Condition.text("selenide.org"));
     }
}

import org.junit.Test;

import static org.junit.Assert.*;

public class CezarTest {

    Cezar cezar = new Cezar();
    final String text = "ВСТРЕТИМСЯ ЗАВТРА УТРОМ";
    final String shifrText = "ЛЫЬЪОЬТЦЫИ СЙЛЬЪЙ ЭЬЪШЦ";

    @Test
    public void coding() {


        String coding = cezar.coding(text, 10);


        final String msg = "Неполучилось зашифровать";
        assertEquals(msg, shifrText, coding);
    }

    @Test
    public void uncoding() {

        String coding = cezar.uncoding(shifrText, 10);


        final String msg = "Неполучилось зашифровать";
        assertEquals(msg, text, coding);
    }
}
import org.example.RafaString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RafaStringsTest {
RafaString rafaString = new RafaString();

    @Test

    void capitalizeTest() {
    assertEquals(RafaString.capitalizar("gerard"), "Gerard");
    assertEquals(RafaString.capitalizar("0tete"), "0Tete");
    assertEquals(RafaString.capitalizar("JoseM"), "JoseM");
    assertEquals(RafaString.capitalizar("óscar"), "Óscar");
    assertEquals(RafaString.capitalizar(null), null);

    }

    @Test





}

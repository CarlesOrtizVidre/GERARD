import org.example.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TemperatureTests {


    @Test
    public void comprobarQuevaBe() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();


        assertEquals(temperatureConverter.celsiusToFahrenheit(0), 32);
        assertEquals(temperatureConverter.celsiusToFahrenheit(32), 89.6f);

    }

    @Test

    public void numeroRandom() {

        int nr = TemperatureConverter.numeroParRabdomEntreZeroyDiez();

        int nr2 = TemperatureConverter.numeroParRabdomEntreZeroyDiez();

        if (nr < 0 || nr2 > 10) {
            fail("No son numeros random");
        }
        if (nr < 0 || nr > 10) {
            fail("Numero fuero del rango 0-10");
        }
        assertEquals(nr%32,0);

    }

}


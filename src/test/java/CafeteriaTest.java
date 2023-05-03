import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    @Test
    void agregarCafe() {
        Cafeteria cafe1 = new Cafeteria("hola", "jaja", "psss");
        cafe1.agregarCafe(34.4, 44.7, "pequeno");
        assertNotNull(cafe1.getListaDeCafes());

    }

    @Test
    void borrarCafe() {
        Cafeteria cafe1 = new Cafeteria("hola", "jaja", "psss");
        cafe1.agregarCafe(34.4, 44.7, "pequeno");
        cafe1.borrarCafe(1);

        assertTrue(cafe1.getListaDeCafes().isEmpty());

    }
}
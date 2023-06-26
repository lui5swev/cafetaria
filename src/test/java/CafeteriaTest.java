import org.junit.jupiter.api.Test;

import java.io.*;

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

    @Test
    void WriteStringToCSV(){
        String filePath = "C:\\Users\\Luis\\IdeaProjects\\trabajoCafeteria\\src\\main\\java\\libroVentas.csv";
        String content = "cafe #1";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.append(content);
            System.out.println("String written to CSV file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Check if the file is empty
            assertTrue(reader.readLine() != null);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
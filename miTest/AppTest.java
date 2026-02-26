package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Persona p;

    @BeforeAll public static void setUp() {
        p = new Persona("Jaime", 25, 'M', 70.0, 1.75);
    }

    @Test public void testNombre() {
        assertTrue(p.getNombre().equals("Jaime"));
    }

    @Test public void testGenero() {
        assertTrue(p.getGenero()=='M');
    }

    @Test public void testIMC() {
        assertTrue(
            String.format("%.2f",p.calcularIMC()).equals("22.86")
        );
    }

    @Test public void testCategoriaIMC() {
        assertTrue(p.categoriaIMC().equals("Normal"));
    }
}
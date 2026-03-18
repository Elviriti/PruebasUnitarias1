package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        boolean resultado = validador.validarNombre("Carlos");
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // --- TUS 5 RETOS A PARTIR DE AQUÍ ---

    @Test
    @DisplayName("Reto 1: El nombre vacío debe ser rechazado")
    public void testNombreVacio() {
        // Un nombre vacío no es válido, esperamos false
        boolean resultado = validador.validarNombre("");
        assertFalse(resultado, "Error: El sistema permitió un nombre vacío");
    }

    @Test
    @DisplayName("Reto 2: Contraseña de 8 caracteres debe ser aceptada")
    public void testPasswordJusta() {
        // Exactamente 8 caracteres es el límite inferior común, esperamos true
        boolean resultado = validador.validarPassword("12345678");
        assertTrue(resultado, "Error: El sistema rechazó una contraseña de 8 caracteres");
    }

    @Test
    @DisplayName("Reto 3: Contraseña corta debe ser rechazada")
    public void testPasswordCorta() {
        // Menos de 8 caracteres (5 en este caso), esperamos false
        boolean resultado = validador.validarPassword("Admin");
        assertFalse(resultado, "Error: El sistema permitió una contraseña demasiado corta");
    }

    @Test
    @DisplayName("Reto 4: Email sin arroba debe ser rechazado")
    public void testEmailSinArroba() {
        // Un formato de email inválido, esperamos false
        boolean resultado = validador.validarEmail("usuario.gmail.com");
        assertFalse(resultado, "Error: El sistema aceptó un email sin símbolo '@'");
    }

    @Test
    @DisplayName("Reto 5: Edad mínima (16 años) debe ser aceptada")
    public void testEdadLimite() {
        // El límite exacto (16), esperamos true
        boolean resultado = validador.validarEdad(16);
        assertTrue(resultado, "Error: El sistema rechazó la edad mínima permitida (16)");
    }
}
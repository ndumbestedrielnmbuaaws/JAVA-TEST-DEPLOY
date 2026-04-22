import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 class ApplicationTest {

 @Test
void appHasAGreeting() {

        Application classUnderTest = new Application();

        // Verifies the method returns a non-null value

        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");

    }

 @Test
void appReturnsCorrectGreeting() {

        Application classUnderTest = new Application();

        // Verifies the actual output matches the expected "Hello World!"

        assertEquals("Hello World!", classUnderTest.getGreeting());

    }

 @Test

    void mainMethodRunsWithoutException() {

        // Basic check to ensure the main method doesn't crash

        assertDoesNotThrow(() -> Application.main(new String[]{}));

    }

}
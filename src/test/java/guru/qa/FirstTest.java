package guru.qa;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("before each method");
    }

    @BeforeEach
    void setUp() {
        System.out.println("before each method");
    }
    @AfterEach
    void tearDown() {
        System.out.println("after all");
    }
    @Test
    void firstTest() {
        System.out.println("@test");
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        System.out.println("@test second");
        Assertions.assertTrue(true);
    }
}

package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddNumbers() {
        App app = new App();
        assertEquals(5, app.addNumbers(2, 3));
    }
}

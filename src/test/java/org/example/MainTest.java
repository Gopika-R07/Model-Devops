package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void leap() {
        assertEquals("Leap year", Main.check(2024));
    }

    @Test
    public void nonleap() {
        assertEquals("Non-Leap year", Main.check(2023));
    }

    @Test
    public void cent() {
        assertEquals("Century year", Main.check(1900));
    }

    @Test
    public void leapCentury() {
        assertEquals("Leap year", Main.check(2000));
    }
}


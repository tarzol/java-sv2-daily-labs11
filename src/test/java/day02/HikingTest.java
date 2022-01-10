package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    Hiking hiking = new Hiking();
    @Test
    void getPlusElevation() {
        assertEquals(13, hiking.getPlusElevation(Arrays.asList(10, 20, 15, 18)));
        assertEquals(0, hiking.getPlusElevation(Arrays.asList(20, 20, 15, 13)));

    }
}
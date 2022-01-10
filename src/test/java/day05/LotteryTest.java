package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void testStartLottery() {
        Lottery lottery5From90 = new Lottery();
        lottery5From90.startLottery(90, 5);
        assertEquals(5, lottery5From90.getNumbers().size());
    }
}
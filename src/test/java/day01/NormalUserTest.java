package day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    NormalUser normalUser = new NormalUser("normal@gmail.com", "1234");

    @Test
    void getUserEmail() {
        assertEquals("normal@gmail.com", normalUser.getUserEmail());
    }

    @Test
    void getPassword() {
        assertEquals("1234", normalUser.getPassword());
    }
}


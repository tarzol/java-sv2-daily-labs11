package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    AdminUser adminUser = new AdminUser("admin@gmail.com", "1234");

    @Test
    void getUserEmail() {
        assertEquals("admin@gmail.com", adminUser.getUserEmail());
    }

    @Test
    void getPassword() {
        assertEquals("****", adminUser.getPassword());
    }
}


package com.example.users;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testUser {
    @Test
    @DisplayName("Is internal URL valid ?")
    void isValidURL(){
        DepopUser depopUser = new DepopUser();
        String expectedURL = "https://api-staging.depop.com";
        assertEquals(expectedURL,depopUser.getInternalURL());

    }
}

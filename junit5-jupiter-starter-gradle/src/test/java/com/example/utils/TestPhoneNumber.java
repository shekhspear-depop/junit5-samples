package com.example.utils;

import com.example.utils.loggers.DepopLogger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPhoneNumber {
    private  static DepopLogger logger = new DepopLogger();
    private static GenerateRandomPhoneNumber ukNumber;

    @BeforeAll
    public static void setupPhoneNumber(){
        logger.getLogger().info("Setting up Phone Number to test");
        ukNumber = new GenerateRandomPhoneNumber();

    }

    @Test
    @DisplayName("UK Number starts with 07")
    void startsWith07 (){
        assertTrue(ukNumber.getPhoneNumberUK().matches("^07\\d{9}$"),
                "Phonenumber "+ukNumber.getPhoneNumberUK()+" does not start with 07");
    }

    @Test
    @DisplayName("UK Number has 11 digits")
    void has11Digits (){
        assertTrue(ukNumber.getPhoneNumberUK().length() == 11,
                "Phonenumber "+ukNumber.getPhoneNumberUK()+" does not contain 11 digits");
    }
}

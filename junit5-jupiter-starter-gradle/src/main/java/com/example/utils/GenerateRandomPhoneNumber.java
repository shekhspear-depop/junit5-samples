package com.example.utils;

import java.util.concurrent.ThreadLocalRandom;

import com.example.utils.loggers.DepopLogger;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class GenerateRandomPhoneNumber {
    DepopLogger logger = new DepopLogger();
    private String phoneNumberUK;

    public GenerateRandomPhoneNumber(){
        this.phoneNumberUK = generateRandomUKNumber();
        logger.getLogger().info("generated UK Phone number is -> " + phoneNumberUK + " consisting of " + phoneNumberUK.length()+ " digits");
    }

    public String getPhoneNumberUK() {
        return phoneNumberUK;
    }

    private String generateRandomUKNumber(){
        String phoneNumber="07";

        return phoneNumber = new StringBuilder().append(phoneNumber).append(ThreadLocalRandom.
                current().
                nextInt(100000000, 999999999)).toString();

    }

}

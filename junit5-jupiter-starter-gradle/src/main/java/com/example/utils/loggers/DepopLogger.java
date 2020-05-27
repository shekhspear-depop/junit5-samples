package com.example.utils.loggers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DepopLogger {
    Logger logger;

    public DepopLogger(){
        this.logger = LogManager.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }

    public Logger getLogger() {
        return logger;
    }

}

package com.baeldung.spring.drools.service;

import org.springframework.stereotype.Service;

@Service
public class HandleError {

    public void handle(final Long distanceInMile, final String message) {
        System.out.printf("Distance can not be negative: %d, message: %s\n", distanceInMile, message);
    }
}

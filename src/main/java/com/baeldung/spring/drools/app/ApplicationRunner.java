package com.baeldung.spring.drools.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.baeldung.spring.drools.model.TaxiRide;
import com.baeldung.spring.drools.model.Fare;
import com.baeldung.spring.drools.service.TaxiFareCalculatorService;
import com.baeldung.spring.drools.service.TaxiFareConfiguration;

public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TaxiFareConfiguration.class);
        TaxiFareCalculatorService taxiFareCalculatorService = (TaxiFareCalculatorService) context.getBean(TaxiFareCalculatorService.class);
        TaxiRide taxiRide = new TaxiRide();
        taxiRide.setIsNightSurcharge(false);
        taxiRide.setDistanceInMile(-5L);
        Fare rideFare = new Fare();
        System.out.printf("Fare is %d", taxiFareCalculatorService.calculateFare(taxiRide, rideFare));
    }

}

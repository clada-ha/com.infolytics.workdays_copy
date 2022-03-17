package com.infolytics.workdays.controller;

import com.infolytics.workdays.model.BusinessTripEntry;

import java.util.Set;

public class TravellerNotificationController {
    public BusinessTripEntry tripEntry = new BusinessTripEntry();
    public String businessEntryCreator = tripEntry.getIdentifierEmployee(); // nach rumtesten auf private!
    Set<String> fellowTravellers;

    {
        fellowTravellers = tripEntry.getFellowTravellers();
    }

    String tripDescription = tripEntry.getDescription();


    // can't put operations like if directly in a class
    // create a constructor for the class and insert algorithm there

    public TravellerNotificationController() {
     if (fellowTravellers == null) {
         System.out.println(":( einsame Dienstreise");
     } else {
         System.out.println(businessEntryCreator + " hat einen neuen Dienstreiseeintrag fuer dich erstellt.");
     }
    }

    }


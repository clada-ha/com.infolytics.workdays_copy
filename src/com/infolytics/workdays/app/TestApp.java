package com.infolytics.workdays.app;

import com.infolytics.workdays.controller.*;
import com.infolytics.workdays.model.BusinessTripEntry;
import com.infolytics.workdays.model.Employee;
import com.infolytics.workdays.model.EmployeeEntries;
import com.infolytics.workdays.model.RegularWorkdays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

public class TestApp {
    public static void main(String[] args) throws ParseException {  // ParseExc: occurs when parsing of a String, that ought to have a special format, fails
        Employee noel = new Employee();
        noel.setName("Noel Marx");
        noel.setIdentifier("noel@infolytics.com");
        noel.addAlias("nmarx@infolytics.com");
        noel.setEmployeeWorkdays(RegularWorkdays.typicalWorkdays());

        BusinessTripEntry gleif = new BusinessTripEntry();
        gleif.setDescription("geschäftsgeplänkel");
        gleif.setIdentifierEmployee(noel.getIdentifier());
        System.out.println("wer ist gereist? " + gleif.getIdentifierEmployee());
        System.out.println(noel.getName() + ", Aktivitaet: " + gleif.getDescription());

        gleif.addFellowTravellers("lea@infolytics.com");
        gleif.addFellowTravellers("ozan@infolytics.com");


        Set<String> fellowTrav = gleif.getFellowTravellers();
        System.out.println("fellow travellers: " + fellowTrav);
        TravellerNotificationController notifyFellowTrav = new TravellerNotificationController();
        System.out.println(notifyFellowTrav.businessEntryCreator = gleif.getIdentifierEmployee());



//        noel.setEmployeeWorkdays(RegularWorkdays.setWorkingHoursMonday(5));   // how to set workingHours for separate days?
//        System.out.println("employee workdays: " + noel.getEmployeeWorkdays());


//        noel.setEmployeeWorkdays();

        System.out.println("hello, " + noel.getName());

        Date today = new Date();

        int noelHoursToday = WorkdaysController.getWorkingHours(today, noel);
        System.out.println("noel has to work " + noelHoursToday + " hours today");

        EmployeeEntries todaysWork = new EmployeeEntries(noel);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        todaysWork.addHoliday(sdf.parse("2021-12-24 07:00:00"), sdf.parse("2021-12-31 16:00:00"), "Weihnachten");

        EmployeeEntriesController.printSysOut(todaysWork);

        NotificationController notificationController = new NotificationController();

        BusinessTripController trip1 = new BusinessTripController();
        trip1.setNotificationController(notificationController);

        trip1.createBusinessTrip("noel@infolytics.com", sdf.parse("2021-12-24 07:00:00"), 3, 4, "wegen der huehner");

        trip1.createBusinessTrip("noel@infolytics.com", sdf.parse("2021-12-24 07:00:00"), 3, 4, "wegen der huehner", "claudia", "lea");

/*
        NotificationController newMail = new NotificationController();
        Session session;
        String myAccount = "charder@infolytics.com";
        String recipient = "cldaharder@gmail.com";
        newMail.prepareMessage(session, myAccount, recipient);
*/




    }
}

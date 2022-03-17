package com.infolytics.workdays.controller;

import com.infolytics.workdays.model.BusinessTripEntry;

import javax.mail.MessagingException;
import java.util.Date; // TODO replace Date w LocalDate
import java.util.Set;

public class BusinessTripController { // Objektcontroller

    private NotificationController notificationController; // TODO HÄ???

    public NotificationController getNotificationController() {
        return notificationController;
    }

    public void setNotificationController(NotificationController notificationController) {
        this.notificationController = notificationController;
    }

    public BusinessTripEntry createBusinessTrip(String identifier, Date startDate, int travelTime, int workingHours, String description, String ...fellowTravellers) {
        BusinessTripEntry trip = new BusinessTripEntry();
        trip.setIdentifierEmployee(identifier);
        trip.setDescription(description);
        trip.setStartDate(startDate);
        trip.setEntryDate(new Date()); // new Date liefert "jetzt"
        trip.setTravelTime(travelTime);
        trip.setHours(workingHours);
        for (String fellower : fellowTravellers) {
            trip.addFellowTravellers(fellower);
        }


        storeBusinessTrip(trip);
        return trip;
    }

    public void storeBusinessTrip(BusinessTripEntry trip) { // TODO: learn how to store in database
        notifyFellowers(trip);
    }

    private void notifyFellowers(BusinessTripEntry hans) {
        Set<String> hansFellowers = hans.getFellowTravellers();
        if (hansFellowers != null && !hansFellowers.isEmpty() && notificationController != null) {
            for (String fellower : hansFellowers) {
                String nachrichtAnFellower = createMessageBody(hans, fellower);
                try {
                    notificationController.sendNotification(fellower, nachrichtAnFellower);
                } catch (MessagingException e) {
                    System.out.println("issue w notificationController.sendNotification");
                    e.printStackTrace();
                }
            }
        }
    }

    private String createMessageBody(BusinessTripEntry franz, String fellowTraveller) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hallo " );
        sb.append(fellowTraveller);
        sb.append(" ");
        sb.append(franz.getIdentifierEmployee());
        sb.append(" hat eine Dienstreise fuer dich erstellt. Hier die Informationen: ");

        // TODO vervollstaendige Brief
        return sb.toString();
    }
}

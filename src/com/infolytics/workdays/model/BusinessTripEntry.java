package com.infolytics.workdays.model;

import java.util.HashSet;
import java.util.Set;


public class BusinessTripEntry extends WorkEntry {


    private Set<String> fellowTravellers = new HashSet<>(); // set of fellowTravellers (Set >> no duplicates)
    private int travelTime;
    // ??? Reisezeiten extra, da Reisezeit*0,5 = Arbeitszeit
    // Multiplizitaet 0...1, da optional


    public void addFellowTravellers(String traveller) {
        this.fellowTravellers.add(traveller);
    }

    public Set<String> getFellowTravellers() {
        return fellowTravellers;
    }

    public void removeFellowTravellers(String fellowTraveller) {
        this.fellowTravellers.remove(fellowTraveller);
    }

//    public String getActivityDescription() {
//        return activityDescription;
//    }
//
//    public void setActivityDescription(String activityDescription) {
//        this.activityDescription = activityDescription;
//    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }
}

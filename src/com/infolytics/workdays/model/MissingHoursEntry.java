package com.infolytics.workdays.model;

public class MissingHoursEntry extends AbsenceEntry {
    private String missingHoursReason;

    public String getMissingHoursReason() {
        return missingHoursReason;
    }

    public void setMissingHoursReason(String missingHoursReason) {
        this.missingHoursReason = missingHoursReason;
    }

}

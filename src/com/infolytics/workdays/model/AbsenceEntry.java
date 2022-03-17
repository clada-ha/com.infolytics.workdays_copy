package com.infolytics.workdays.model;

import java.util.Date;

public class AbsenceEntry extends Entry {
    private Date startAbsence;
    private Date endAbsence;


    public Date getStartAbsence() {
        return startAbsence;
    }

    public void setStartAbsence(Date startAbsence) {
        this.startAbsence = startAbsence;
    }

    public Date getEndAbsence() {
        return endAbsence;
    }

    public void setEndAbsence(Date endAbsence) {
        this.endAbsence = endAbsence;
    }
}

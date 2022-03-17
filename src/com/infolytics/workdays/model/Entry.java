package com.infolytics.workdays.model;

import java.util.Date;

public abstract class Entry {
    private Date entryDate; // replace Date w LocalDate
    private String description;
    private String identifierEmployee;
    private Date startDate;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Entry() {
        this.entryDate = new Date();
    }


    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdentifierEmployee() {
        return identifierEmployee;
    }

    public void setIdentifierEmployee(String identifierEmployee) {
        this.identifierEmployee = identifierEmployee;
    }
}

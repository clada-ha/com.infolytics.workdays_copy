package com.infolytics.workdays.model;

public class RegularWorkdays {
    private int workingHoursMonday;
    private int workingHoursTuesday;
    private int workingHoursWednesday;
    private int workingHoursThursday;
    private int workingHoursFriday;
    private int workingHoursSaturday;
    private int workingHoursSunday;

    public static RegularWorkdays typicalWorkdays() {
        RegularWorkdays result = new RegularWorkdays();
        result.setWorkingHoursMonday(8);
        result.setWorkingHoursTuesday(8);
        result.setWorkingHoursWednesday(8);
        result.setWorkingHoursThursday(8);
        result.setWorkingHoursFriday(8);
        return result;
    }


    public int getWorkingHoursMonday() {
        return workingHoursMonday;
    }

    public void setWorkingHoursMonday(int workingHoursMonday) {
        this.workingHoursMonday = workingHoursMonday;
    }

    public int getWorkingHoursTuesday() {
        return workingHoursTuesday;
    }

    public void setWorkingHoursTuesday(int workingHoursTuesday) {
        this.workingHoursTuesday = workingHoursTuesday;
    }

    public int getWorkingHoursWednesday() {
        return workingHoursWednesday;
    }

    public void setWorkingHoursWednesday(int workingHoursWednesday) {
        this.workingHoursWednesday = workingHoursWednesday;
    }

    public int getWorkingHoursThursday() {
        return workingHoursThursday;
    }

    public void setWorkingHoursThursday(int workingHoursThursday) {
        this.workingHoursThursday = workingHoursThursday;
    }

    public int getWorkingHoursFriday() {
        return workingHoursFriday;
    }

    public void setWorkingHoursFriday(int workingHoursFriday) {
        this.workingHoursFriday = workingHoursFriday;
    }

    public int getWorkingHoursSaturday() {
        return workingHoursSaturday;
    }

    public void setWorkingHoursSaturday(int workingHoursSaturday) {
        this.workingHoursSaturday = workingHoursSaturday;
    }

    public int getWorkingHoursSunday() {
        return workingHoursSunday;
    }

    public void setWorkingHoursSunday(int workingHoursSunday) {
        this.workingHoursSunday = workingHoursSunday;
    }
}

package com.infolytics.workdays.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeEntries {
    private List<Entry> entries;
    private String employeeIdentifier;


    public EmployeeEntries() {
        entries = new ArrayList<>(); // wieso ist das nicht schon in line 8 eine ArrayList?
    }

    public EmployeeEntries(Employee employee) {
        this(); // standard constructor wird auch aufgerufen // this???
        setEmployeeIdentifier(employee.getIdentifier());
    }

    // getter & setter

    public String getEmployeeIdentifier() {
        return employeeIdentifier;
    }

    public void setEmployeeIdentifier(String employeeIdentifier) {
        this.employeeIdentifier = employeeIdentifier;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public void addHoliday(Date start, Date end, String reason) {
        HolidayEntry add = new HolidayEntry();
        add.setStartAbsence(start);
        add.setEndAbsence(end);
        add.setDescription(reason);
        addEntry(add);
    }

}

package com.infolytics.workdays.controller;

import com.infolytics.workdays.model.AbsenceEntry;
import com.infolytics.workdays.model.EmployeeEntries;
import com.infolytics.workdays.model.Entry;

import java.text.SimpleDateFormat;

public class EmployeeEntriesController {
    public static void printSysOut(EmployeeEntries printMe) {
        System.out.println("Employee: " + printMe.getEmployeeIdentifier());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // hh = 12 hour format

        for (Entry entry : printMe.getEntries()) {
            System.out.println(entry.getClass() + " - " + entry.getDescription() + ", entry date: " + sdf.format(entry.getEntryDate()));
            if (entry instanceof AbsenceEntry) {
                AbsenceEntry a = (AbsenceEntry) entry;
                System.out.println("start: " + sdf.format(a.getStartAbsence()));
                System.out.println("end: " + sdf.format(a.getEndAbsence()));
            }
        }


    }
}

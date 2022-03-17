package com.infolytics.workdays.controller;

import com.infolytics.workdays.model.Employee;

import java.util.Calendar;
import java.util.Date;
// TODO replace Date w LocalDate

public class WorkdaysController {
    public static int getWorkingHours(Date date, Employee employee) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        if (employee.getEmployeeWorkdays() == null) {
            return 0;
        }

        switch (day) {
            case Calendar.MONDAY:
                return employee.getEmployeeWorkdays().getWorkingHoursMonday();

            case Calendar.TUESDAY:
                return employee.getEmployeeWorkdays().getWorkingHoursTuesday();

            case Calendar.WEDNESDAY:
                return employee.getEmployeeWorkdays().getWorkingHoursWednesday();

            case Calendar.THURSDAY:
                return employee.getEmployeeWorkdays().getWorkingHoursThursday();

            case Calendar.FRIDAY:
                return employee.getEmployeeWorkdays().getWorkingHoursFriday();

            case Calendar.SATURDAY:
                return employee.getEmployeeWorkdays().getWorkingHoursSaturday();

            case Calendar.SUNDAY:
                return employee.getEmployeeWorkdays().getWorkingHoursSunday();

            default:
                return -1;
        }
    }
}

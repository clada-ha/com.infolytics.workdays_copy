package com.infolytics.workdays.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String identifier;
    private String name;
    private List<String> aliases;

    private RegularWorkdays employeeWorkdays;


    public Employee() {
        this.aliases = new ArrayList<>();  // <> empty = same generics as in declaration
    }


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {   // *eig* koennte man hier Regeln implementieren, ABER Validierung meist im Controller
        this.name = name;
    }

    public List<String> getAliases() {
        return aliases;
    }

    public void addAlias(String alias) {
        aliases.add(alias);
    }

    public RegularWorkdays getEmployeeWorkdays() {
        return employeeWorkdays;
    }

    public void setEmployeeWorkdays(RegularWorkdays employeeWorkdays) {
        this.employeeWorkdays = employeeWorkdays;
    }
    

//    public void setEmployeeWorkdays() {
//    }
}

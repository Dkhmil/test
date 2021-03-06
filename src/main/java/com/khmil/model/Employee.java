package com.khmil.model;

import com.khmil.annotations.ColumnName;
import com.khmil.annotations.TableName;

@TableName(name = "EMPLOYEE")
public class Employee {

    @ColumnName(name = "ID")
    private static Long id;

    @ColumnName(name = "FIRST_NAME")
    private String firstName;

    @ColumnName(name = "MIDDLE_NAME")
    private static String middleName;

    @ColumnName(name = "LAST_NAME")
    private static String lastName;

    @ColumnName(name = "TITLE")
    private static String title;

    @ColumnName(name = "SALARY")
    private static String salary;

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getSalary() {
        return salary;
    }

    public Employee() {
    }

    public Employee(Long iD, String firstName, String middleName, String lastName, String title, String salary) {
        this.id = iD;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.title = title;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
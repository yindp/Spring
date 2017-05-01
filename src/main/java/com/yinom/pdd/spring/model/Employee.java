package com.yinom.pdd.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by yindp on 4/30/17.
 */
public class Employee {
    private int id;
    private String name;
    private double salary;
    private Department department;
    private List<String> interests;
    private Set<String> hobbies;
    private Map<String,String> favorites;
    private Properties jobs;

    public Properties getJobs() {
        return jobs;
    }

    public void setJobs(Properties jobs) {
        this.jobs = jobs;
    }

    public Map<String, String> getFavorites() {
        return favorites;
    }

    public void setFavorites(Map<String, String> favorites) {
        this.favorites = favorites;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee() {

    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", interests=" + interests +
                ", hobbies=" + hobbies +
                ", favorites=" + favorites +
                ", jobs=" + jobs +
                '}';
    }
}

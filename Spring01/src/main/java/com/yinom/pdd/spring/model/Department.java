package com.yinom.pdd.spring.model;

/**
 * Created by yindp on 5/1/17.
 */
public abstract class Department {
    private int id;
    private String name;
    private Part part;

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

    public abstract Part getPart();

    public void setPart(Part part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

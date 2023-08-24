package com.example.database.databasedemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
@Entity

public class Person {
    @Id
@GeneratedValue
    private int id;

    private String name;
    private String location;
    private Timestamp date_birth;

    public Person(){}
    public Person(int id, String name, String location, Timestamp date_birth) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.date_birth = date_birth;
    }
    public Person( String name, String location, Timestamp date_birth) {

        this.name = name;
        this.location = location;
        this.date_birth = date_birth;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Timestamp getDatebirth() {
        return date_birth;
    }

    public void setDatebirth(Timestamp datebirth) {
        this.date_birth = datebirth;
    }

    @Override
    public String toString() {
        return " \n Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", datebirth=" + date_birth +
                '}';
    }
}

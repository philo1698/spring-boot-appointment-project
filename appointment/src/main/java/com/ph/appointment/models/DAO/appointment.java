package com.ph.appointment.models.DAO;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "appointment")
public class appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;

    private String phoneNumber;

    private LocalDate date;

    private LocalTime time;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(length = 1000)
    private String notes;

    // Constructors
    public appointment() {}

    public appointment(String clientName, String phoneNumber, LocalDate date,
                       LocalTime time, Status status, String notes) {
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.time = time;
        this.status = status;
        this.notes = notes;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

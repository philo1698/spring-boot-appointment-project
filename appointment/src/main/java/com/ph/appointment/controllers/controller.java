package com.ph.appointment.controllers;

import com.ph.appointment.models.DAO.appointment;
import com.ph.appointment.models.DTO.simpleAppointment;
import com.ph.appointment.services.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class controller {

    @Autowired
    private service appointment_service;

    @PostMapping("/create")
    public appointment create_appointment (@RequestBody appointment appointment_in){
        return appointment_service.create(appointment_in);
    }

    @DeleteMapping("/delete")
    public String delete_appointment (@RequestBody Long id){
        return appointment_service.delete(id);
    }

    @PatchMapping("/update/{id}")
    public appointment updateAppointment(@PathVariable Long id,
                                         @RequestBody simpleAppointment request) {

        appointment appointment_in = appointment_service.getAppointmentById(id);
        if (appointment_in == null) return null;

        // Update only provided fields
        if (request.getClientName() != null)
            appointment_in.setClientName(request.getClientName());

        if (request.getPhoneNumber() != null)
            appointment_in.setPhoneNumber(request.getPhoneNumber());

        if (request.getDate() != null)
            appointment_in.setDate(request.getDate());

        if (request.getTime() != null)
            appointment_in.setTime(request.getTime());

        if (request.getStatus() != null)
            appointment_in.setStatus(request.getStatus());

        if (request.getNotes() != null)
            appointment_in.setNotes(request.getNotes());

        return appointment_service.updateAppointment(id, appointment_in);
    }

    @PutMapping("/update-full/{id}")
    public appointment updateFullTask(@PathVariable Long id,
                               @RequestBody appointment request) {
        return appointment_service.updateAppointment(id, request);
    }
}

package com.ph.appointment.services;

import com.ph.appointment.models.DAO.appointment;
import com.ph.appointment.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class service {
    @Autowired
    private repository appointent_repository;

    public appointment create(appointment appointment_in){
        return appointent_repository.save(appointment_in);
    }

    public String delete(Long id){
        appointent_repository.deleteById(id);
        return "appointment deleted successfully";
    }

    public appointment getAppointmentById(Long id) {
        Optional<appointment> task = appointent_repository.findById(id);
        return task.orElse(null); // return null if not found
    }

    public appointment updateAppointment(Long id, appointment updatedAppointment) {

        appointment existing = getAppointmentById(id);
        if (existing == null) return null;

        existing.setClientName(updatedAppointment.getClientName());
        existing.setPhoneNumber(updatedAppointment.getPhoneNumber());
        existing.setDate(updatedAppointment.getDate());
        existing.setTime(updatedAppointment.getTime());
        existing.setStatus(updatedAppointment.getStatus());
        existing.setNotes(updatedAppointment.getNotes());

        return appointent_repository.save(existing);
    }
}

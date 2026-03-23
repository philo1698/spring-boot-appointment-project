package com.ph.appointment.services;

import com.ph.appointment.models.DAO.appointment;
import com.ph.appointment.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
    @Autowired
    private repository appointent_repository;

    public appointment create (appointment appointment_in){
        return appointent_repository.save(appointment_in);
    }
}

package com.ph.appointment.controllers;

import com.ph.appointment.models.DAO.appointment;
import com.ph.appointment.services.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class controller {

    @Autowired
    private service appointment_service;

    @PostMapping("/create")
    public appointment create_appointment (@RequestBody appointment appointment_in){
        return appointment_service.create(appointment_in);
    }
}

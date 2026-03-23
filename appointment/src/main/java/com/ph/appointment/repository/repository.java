package com.ph.appointment.repository;

import com.ph.appointment.models.DAO.appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<appointment, Long> {

}

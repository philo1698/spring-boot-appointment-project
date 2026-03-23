package com.ph.appointment.repository;

import com.ph.appointment.models.DAO.appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repository extends JpaRepository<appointment, Long> {

    List<appointment> findByIdIn(List<Long> ids);
}

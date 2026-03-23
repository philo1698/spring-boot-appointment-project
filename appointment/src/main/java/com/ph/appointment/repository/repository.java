package com.ph.appointment.repository;

import com.ph.appointment.models.DAO.appointment;
import com.ph.appointment.models.DTO.idsList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repository extends JpaRepository<appointment, Long> {

    List<appointment> FindByIds(List<Long> ids);
}

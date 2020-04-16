package com.hcas.repository;

import com.hcas.data.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

//@Component
public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {

    @Query(value = "from Appointment  where docId=?1")
    List<Appointment>  searchByDoctorID(String docId);

    @Query(value = "from Appointment  where hosId=?1")
    List<Appointment>  searchByHospitalID(String hosId);

    @Query(value = "from Appointment  where date=?1")
    List<Appointment>  searchByDate(String date);
}

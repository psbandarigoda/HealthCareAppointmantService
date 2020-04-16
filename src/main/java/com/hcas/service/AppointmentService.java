package com.hcas.service;

import com.hcas.data.model.Appointment;

import java.util.Date;
import java.util.List;

public interface AppointmentService {

    String addAppointment(Appointment appointment);

    List<Appointment> getAllAppointments();

    String updateAppointment(Appointment appointment);

    String removeAppointment(Appointment appointment);

    List<Appointment> searchByDoctor(String docID);

    List<Appointment> searchByHospital(String hosID);

    List<Appointment> searchByDate(String hosID);

}

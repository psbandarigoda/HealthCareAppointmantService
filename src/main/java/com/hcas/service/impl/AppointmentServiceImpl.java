package com.hcas.service.impl;

import com.hcas.data.model.Appointment;
import com.hcas.repository.AppointmentRepo;
import com.hcas.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Override
    public String addAppointment(Appointment appointment) {
        System.out.println(appointment);
        Appointment a1 = appointmentRepo.save(appointment);

        if (a1 != null) {
            return "Success";

        } else {
            return null;
        }
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepo.findAll();
    }

    @Override
    public String updateAppointment(Appointment appointment) {
        System.out.println(appointment);
        Appointment a1 = appointmentRepo.save(appointment);

        if (a1 != null) {
            return "Success";

        } else {
            return null;
        }
    }

    @Override
    public String removeAppointment(Appointment appointment) {
        System.out.println(appointment);
        appointmentRepo.deleteById(appointment.getId());

        if (appointment != null) {
            return "Success";

        } else {
            return null;
        }
    }

    @Override
    public List<Appointment> searchByDoctor(String docID) {
        List<Appointment> appointments = appointmentRepo.searchByDoctorID(docID);
        if (appointments.size() != 0) {
            return appointments;
        } else {
            return null;
        }
    }

    @Override
    public List<Appointment> searchByHospital(String docID) {
        List<Appointment> appointments = appointmentRepo.searchByHospitalID(docID);
        if (appointments.size() != 0) {
            return appointments;
        } else {
            return null;
        }
    }

    @Override
    public List<Appointment> searchByDate(String date) {
        List<Appointment> appointments = appointmentRepo.searchByDate(date);
        if (appointments.size() != 0) {
            return appointments;
        } else {
            return null;
        }
    }

}

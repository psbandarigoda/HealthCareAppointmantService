package com.hcas.controller;

import java.net.URI;
import com.hcas.data.model.Appointment;
import com.hcas.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.ws.rs.PathParam;
//import com.google.inject.Inject;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Date;
import java.util.List;

//@Path("/appointment")
//@Produces("application/json")
@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

//    @Inject
//    public AppointmentController (AppointmentService appointmentService) {
//        this.appointmentService = appointmentService;
//    }

//    @Path("/addAppointment")
//    @POST
    @PostMapping(value = "/addAppointment")
    public String addAppointment(@RequestBody Appointment appointment) {
        System.out.println(appointment);
        String s1 = appointmentService.addAppointment(appointment);

        if (s1 != null) {
            return "Success";
        } else {
            return null;
        }
    }


    @GetMapping(value = "/getAllAppointments")
    public List<Appointment> getAllAppointments() {
        List s1 = appointmentService.getAllAppointments();

        if (s1.size() != 0) {
            return appointmentService.getAllAppointments();
        } else {
            return null;
        }
    }


    @PostMapping(value = "/updateAppointment")
    public String updateAppointment(@RequestBody Appointment appointment) {
        System.out.println(appointment);
        String s1 = appointmentService.updateAppointment(appointment);

        if (s1 != null) {
            return "Success";
        } else {
            return null;
        }
    }

    @DeleteMapping(value = "/removeAppointment")
    public String removeAppointment(@RequestBody Appointment appointment) {
        System.out.println(appointment);
        String s1 = appointmentService.removeAppointment(appointment);

        if (s1 != null) {
            return "Success";
        } else {
            return null;
        }
    }

    @GetMapping(value = "/searchByDoctor/{docID}")
    public List<Appointment>  searchByDoctor(@PathVariable String docID ){
        System.out.println("docId"+docID);
        return appointmentService.searchByDoctor(docID);
    }


    @GetMapping(value = "/searchByHospital/{hosID}")
    public List<Appointment>  searchByHospital(@PathVariable String hosID ){
        System.out.println("hosId"+hosID);
        return appointmentService.searchByHospital(hosID);
    }


    @GetMapping(value = "/searchByDate/{date}")
    public List<Appointment>  searchByDate(@PathVariable String date){
        System.out.println("hosId"+date);
        return appointmentService.searchByDate(date);
    }

}

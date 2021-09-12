package com.lhint.springdemo2.controller;

import com.lhint.springdemo2.model.Course;
import com.lhint.springdemo2.model.Registration;
import com.lhint.springdemo2.service.RegistrationService;
import com.lhint.springdemo2.service.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    @Autowired
    RegistrationServiceImpl registrationService;

    @GetMapping("/registrations/{id}")
    public Registration getRegistrationById(@PathVariable Integer id){
        return registrationService.find(id);
    }

    @GetMapping("/registrations")
    public List<Registration> listAllRegistrations(){
        return registrationService.listAll();
    }

    @PostMapping("/registrations")
    public Registration createRegistration(@Valid @RequestBody Registration registration) {
        System.out.println(registration.getName());
        return registrationService.saveOrUpdate(registration);
    }

    @DeleteMapping("/registrations/{registrationId}")
    public void deleteRegistration(@PathVariable Integer registrationId){
        registrationService.delete(registrationId);
    }


    @PutMapping("registrations")
    public Registration updateRegistration(@RequestBody Registration registration){
        return registrationService.saveOrUpdate(registration);
    }
}

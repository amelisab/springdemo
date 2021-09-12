package com.lhint.springdemo2.service;

import com.lhint.springdemo2.model.Registration;
import com.lhint.springdemo2.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    @Override
    public Registration saveOrUpdate(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public void delete(Integer id) {
        registrationRepository.delete(find(id));
    }

    @Override
    public Registration find(Integer id) {
        return registrationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id is invalid"));

    }

    @Override
    public List<Registration> listAll() {
        return registrationRepository.findAll();
    }
}

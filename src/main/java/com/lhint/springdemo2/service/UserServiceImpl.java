package com.lhint.springdemo2.service;

import com.lhint.springdemo2.model.User;
import com.lhint.springdemo2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveOrUpdate(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.delete(find(id));
    }

    @Override
    public User find(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Id is invalid"));
    }

    @Override
    public List<User> listAll() {

        return userRepository.findAll();
    }
}

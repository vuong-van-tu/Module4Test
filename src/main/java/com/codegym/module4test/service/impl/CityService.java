package com.codegym.module4test.service.impl;

import com.codegym.module4test.model.City;
import com.codegym.module4test.repository.ICityRepository;
import com.codegym.module4test.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService {
   @Autowired
   ICityRepository cityRepository;


    @Override
    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepository.findById(id);
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
            cityRepository.deleteById(id);
    }
}

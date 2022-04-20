package com.example.exammodule4.service;

import com.example.exammodule4.model.City;

import java.util.Optional;

public interface ICityService {
    Iterable<City> findAll();

    Optional<City> findById(Long id);

    City save(City city);

    void removeById(Long id);

}

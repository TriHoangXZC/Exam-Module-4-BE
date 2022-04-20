package com.example.exammodule4.service;

import com.example.exammodule4.model.Country;

public interface ICountryService {
    Iterable<Country> findAll();
}

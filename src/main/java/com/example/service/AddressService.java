package com.example.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AddressService {
    List<String> getParticularStatePersonWithCityAreaPincode(String state );
}

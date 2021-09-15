package com.example.service;

import com.example.entity.Person;
import com.example.model.request.PersonRequestModel;
import com.example.model.request.PersonSearchRequestModel;
import com.example.model.response.PersonResponseModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {

    PersonResponseModel addPerson(PersonRequestModel personRequestModel);

    List<Person> searchPerson(PersonSearchRequestModel personSearchRequestModel);
}

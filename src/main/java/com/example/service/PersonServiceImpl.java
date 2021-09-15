package com.example.service;

import com.example.entity.Person;
import com.example.model.request.PersonRequestModel;
import com.example.model.request.PersonSearchRequestModel;
import com.example.model.response.PersonResponseModel;
import com.example.repository.PersonRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private EntityManager entityManager;


    @Override
    public PersonResponseModel addPerson(PersonRequestModel personRequestModel) {
        Person person = new Person();
        person.setFirstName(personRequestModel.getFirstName());
        person.setLastName(personRequestModel.getLastName());
        person.setBirthDate(personRequestModel.getBirthDate());
        person.setMobile(personRequestModel.getMobile());
        person.setAddress(personRequestModel.getAddress());

        Person savedPerson = personRepository.saveAndFlush(person);

        PersonResponseModel personResponseModel = new PersonResponseModel();
        personResponseModel.setFirstName(savedPerson.getFirstName());
        personResponseModel.setLastName(savedPerson.getLastName());
        personResponseModel.setBirthDate(savedPerson.getBirthDate());
        personResponseModel.setMobile(savedPerson.getMobile());
        personResponseModel.setAddress(savedPerson.getAddress());
        return personResponseModel;
    }

    @Override
    public List<Person> searchPerson(PersonSearchRequestModel personSearchRequestModel) {
        return null;
    }
}

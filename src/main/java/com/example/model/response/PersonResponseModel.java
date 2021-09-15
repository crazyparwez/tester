package com.example.model.response;

import com.example.entity.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
public class PersonResponseModel {
    @JsonProperty(value = "firstName")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @JsonProperty(value = "birthDate")
    private LocalDate birthDate;

    @JsonProperty(value = "mobile")
    private int mobile;

    @JsonProperty(value = "address")
    private Set<Address> address = new HashSet<>();
}

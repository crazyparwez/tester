package com.example.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class PersonSearchRequestModel {
    @JsonProperty(value = "firstName")
    private String firstName;

    @JsonProperty(value = "lastName")
    private String lastName;

    @JsonProperty(value = "startRangeBirthDate")
    private LocalDate startRangeBirthDate;

    @JsonProperty(value = "endRangeBirthDate")
    private LocalDate endRangeBirthDate;

    @JsonProperty(value = "mobile")
    private Long mobile;
}

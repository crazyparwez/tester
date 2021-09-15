package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int mobile;
    @OneToMany(cascade = CascadeType.ALL, targetEntity=Address.class)
    private Set<Address> address = new HashSet<>();

}

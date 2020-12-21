package com.tts.shermanProject.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;


    

    public Customer(Long id, String firstName, String lastName) {
//        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
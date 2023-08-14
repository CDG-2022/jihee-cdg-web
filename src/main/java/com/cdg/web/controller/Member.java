package com.cdg.web.controller;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

public class Member {
    @Id
    @GeneratedValue
    @Column(name = "member id")
    private Long id;
    private String password;
    private String name;
    private String email;
    private String role;
    private LocalDate registerDate;
    private LocalDate ModifyDate;

}

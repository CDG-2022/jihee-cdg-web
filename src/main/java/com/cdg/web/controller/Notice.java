package com.cdg.web.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Notice {
    private int id;
    private String title;
    private String contents;
    private String author;
    private LocalDate registerDate;
    private LocalDate modifyDate;
}

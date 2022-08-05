package com.example.rest_library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String name;
    private String type;
    private String author;
    private String location;
}

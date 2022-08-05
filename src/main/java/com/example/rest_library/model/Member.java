package com.example.rest_library.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Member {
    private int id;
    private String name;
    private String gender;
    private List<Book> bookList;
}

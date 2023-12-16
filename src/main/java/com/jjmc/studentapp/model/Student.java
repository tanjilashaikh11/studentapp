package com.jjmc.studentapp.model;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {
    @Id
    private int id;
    private String firstName;
    private String lastName;
}

package com.example.mentoring;

import jakarta.persistence.*;

@Entity
public class Chiikawa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String name;

    @Column (unique = true)
    private String birth;

    @Column
    private Integer age;

    public Chiikawa(String name, String birth, Integer age) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.age = age;
    }
}
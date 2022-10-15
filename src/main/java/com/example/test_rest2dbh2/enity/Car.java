package com.example.test_rest2dbh2.enity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "CARS")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "mark")
    private String mark;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "age")
    private int age;

    public Car() {

    }

    public Car(String mark, String name, String type, int age) {
        this.mark = mark;
        this.name = name;
        this.type = type;
        this.age = age;
    }

}

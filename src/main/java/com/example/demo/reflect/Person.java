package com.example.demo.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long id;
    private String name;

    public Person(Person person) {
        this.id = person.id;
        this.name = person.name;
    }

    Person(String message) {
        this.name = message;
        System.out.println(message);
    }
}

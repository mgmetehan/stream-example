package com.mgmetehan.streamexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String name;
    private int age;
    private Gender gender;
    private Habitat habitat;
    private List<String> favoriteFoods;
}

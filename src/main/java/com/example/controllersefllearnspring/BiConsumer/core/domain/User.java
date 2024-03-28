package com.example.controllersefllearnspring.BiConsumer.core.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private String age;
    private String address;
    private Type type;
}

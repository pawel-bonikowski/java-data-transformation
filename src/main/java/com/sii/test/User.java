/**
 * ------------------------------------------------------------
 * Copyright (c) PUMA SE
 * This software is the proprietary information of PUMA SE
 * All Right Reserved.
 * ------------------------------------------------------------
 */
package com.sii.test;


import java.time.LocalDate;

public class User {

    private final String id;

    private final String name;

    private final String surName;

    private final LocalDate birthDate;

    public User(String id, String name, String surName, LocalDate birtfDate) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.birthDate = birtfDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}

/**
 * ------------------------------------------------------------
 * Copyright (c) PUMA SE
 * This software is the proprietary information of PUMA SE
 * All Right Reserved.
 * ------------------------------------------------------------
 */
package com.sii.test;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UserRepository {

    private static Set<User> users = new HashSet<>();

    static {
        users.add(new User("1", "Jon", "Smith", LocalDate.of(1987, 4, 15)));
        users.add(new User("2", "Janek", "Kowalski", LocalDate.of(1987, 1, 14)));
        users.add(new User("3", "Ania", "Kowal", LocalDate.of(1991, 7, 9)));
        users.add(new User("4", "Piotr", "Dabulis", LocalDate.of(1984, 11, 30)));
    }


    public Collection<User> getAll() {
        return users;
    }
}

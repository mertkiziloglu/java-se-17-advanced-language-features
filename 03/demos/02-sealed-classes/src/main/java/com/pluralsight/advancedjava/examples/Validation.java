/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.examples;

/**
 * Utility method for validation, used in the examples.
 */
public final class Validation {

    private Validation() {
    }

    public static void checkThat(boolean expr, String message) {
        if (!expr) {
            throw new IllegalArgumentException(message);
        }
    }
}

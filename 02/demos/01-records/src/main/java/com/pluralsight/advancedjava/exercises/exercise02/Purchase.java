/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise02;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Exercise 2: This record represents a purchase of a certain quantity of a product at a certain price, and a certain date and time.
 * <p>
 * TODO: It's important to ensure that instances of this record are always in a valid state. Add a constructor to this record that checks if the values
 *       of the components conform to the following rules. Make the constructor throw an {@link IllegalArgumentException} for invalid values.
 *       - quantity must be greater than zero.
 *       - price must be greater than zero.
 *       - dateTime must be in the past (not in the future).
 *       Run the included unit test {@link Exercise02Test} to check if you have done this correctly.
 */
public record Purchase(long productId, int quantity, BigDecimal price, LocalDateTime dateTime) {

    public Purchase {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero");
        }
        if (price.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        if (dateTime.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Date and time must be in the past");
        }
    }

}

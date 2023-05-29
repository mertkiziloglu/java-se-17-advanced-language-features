/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.examples.example01;

import java.math.BigDecimal;

import static com.pluralsight.advancedjava.examples.Validation.checkThat;

// An order line that represents a discount, indicated by a discount code and an amount.
public record DiscountOrderLine(String discountCode, BigDecimal amount) implements OrderLine {

    public DiscountOrderLine {
        checkThat(discountCode != null && !discountCode.isBlank(), "discountCode must not be null or blank");
        checkThat(amount.compareTo(BigDecimal.ZERO) > 0, "amount must be greater than zero");
    }
}

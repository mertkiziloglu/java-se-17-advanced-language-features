/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.examples.example01;

// Sealed interface OrderLine, which allows two types of order lines: SaleOrderLine and DiscountOrderLine.
public sealed interface OrderLine permits SaleOrderLine, DiscountOrderLine {
}

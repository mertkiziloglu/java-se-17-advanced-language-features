/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise01;

/**
 * Exercise 1: This interface represents a financial transaction, which can be either a purchase or a refund.
 * <p>
 * TODO: Make this a sealed interface. Add an appropriate 'permits' clause.
 */
public sealed interface Transaction permits Purchase, Refund{
}

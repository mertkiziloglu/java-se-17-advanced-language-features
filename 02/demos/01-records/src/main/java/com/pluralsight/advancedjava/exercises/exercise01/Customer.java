
package com.pluralsight.advancedjava.exercises.exercise01;

/**
 * Exercise 1: This is a regular mutable Java class (a POJO, Plain Old Java Object) that represents a customer.
 * <p>
 * TODO: Make this class immutable. Edit the class in whatever way you think is necessary to make it immutable.
 *       Don't make it a record for this exercise - the point here is to learn how to make a regular class immutable.
 *       Run the included unit test {@link Exercise01Test} to check if you have done this correctly.
 */
public final class Customer {

    private final int id;
    private final String name;
    private final String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

}

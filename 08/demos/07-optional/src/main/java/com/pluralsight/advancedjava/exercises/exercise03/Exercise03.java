/*
 * This code is part of the course "Java SE 17 Advanced Language Features" for Pluralsight.
 *
 * Copyright (C) 2022 by Jesper de Jong (jesper@jdj-it.com).
 */
package com.pluralsight.advancedjava.exercises.exercise03;

import com.pluralsight.advancedjava.exercises.Customer;

import java.util.List;
import java.util.Optional;

/**
 * Exercise 3: Transforming nullable values into Optionals and working with a Stream of Optionals.
 */
public class Exercise03 {

    // TODO: The method findCustomersByEmailAddresses takes a list of e-mail addresses as an argument.
    //       Start by creating a stream of this list.
    //       Call the method findCustomerByEmailAddress to find the Customer for each e-mail address.
    //       - Note: That method returns null when a Customer is not found.
    //       Transform the stream of Customers to a Stream<Optional<Customer>>.
    //       Finally, transform this into a Stream<Customer>, removing the empty Optionals.
    //       Uncomment the code below and fill in the blanks.
    //       Run the included unit test {@link Exercise03Test} to check if you have done this correctly.
    //
    // Hint: How you transform a Stream<Optional<...>> into a Stream<...>, removing the empty Optionals, is explained exactly in the videos of the course.
    //       Review the video in the module about Optional if you're not sure how to do this.

    public static List<Customer> findCustomersByEmailAddresses(List<String> emailAddresses) {
//        return emailAddresses.stream()
//                .map(emailAddress -> ...) // TODO: Fill in the lambda expression here
//                // TODO: Add one more stream operation here
//                .toList();

        throw new UnsupportedOperationException("Not yet implemented"); // TODO: Remove this line
    }

    // NOTE: For this exercise, do not modify this method.
    private static Customer findCustomerByEmailAddress(String emailAddress) {
        for (Customer customer : Customer.CUSTOMERS) {
            if (customer.emailAddress().equals(emailAddress)) {
                return customer;
            }
        }
        return null;
    }
}

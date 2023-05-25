
package com.pluralsight.advancedjava.examples.example01;

/**
 * Example of a record with the same functionality as the immutable class {@link ProductCls}.
 */
public record ProductRec(long id, String name, String description) {
}

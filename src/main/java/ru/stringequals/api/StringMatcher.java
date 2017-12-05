package ru.stringequals.api;

import java.util.Comparator;

/**
 * @author Pavel Golovkin
 */
@FunctionalInterface
public interface StringMatcher {

  boolean match(String string1, String string2);
}

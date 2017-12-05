package ru.stringequals.api;

/**
 * @author Pavel Golovkin
 */
public class EqualsStringMatcher implements StringMatcher {

  @Override
  public boolean match(String string1, String string2) {
    return string1.equals(string2);
  }
}

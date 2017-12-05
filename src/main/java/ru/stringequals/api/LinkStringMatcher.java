package ru.stringequals.api;

/**
 * @author Pavel Golovkin
 */
public class LinkStringMatcher implements StringMatcher {
  @Override
  public boolean match(String string1, String string2) {
    return string1 == string2;
  }
}

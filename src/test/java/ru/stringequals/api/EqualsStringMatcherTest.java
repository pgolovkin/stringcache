package ru.stringequals.api;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Pavel Golovkin
 */
public class EqualsStringMatcherTest {

  private StringMatcher stringMatcher = new EqualsStringMatcher();

  @Rule
  public Retry retry = new Retry(1_000_000);

  @Test
  public void matchSameString() {
    String str1 = "test";
    String str2 = "test";
    assertTrue(stringMatcher.match(str1, str2));
  }

  @Test
  public void matchSameLinks() {
    String str1 = "test";
    String str2 = str1;
    assertTrue(stringMatcher.match(str1, str2));
  }

  @Test
  public void matchSameNewStrings() {
    String str1 = "test";
    String str2 = new String("test");
    assertTrue(stringMatcher.match(str1, str2));
  }

}
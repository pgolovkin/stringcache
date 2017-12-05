package ru.stringequals.api;

import com.sun.javafx.binding.StringFormatter;
import java.util.Formatter;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Pavel Golovkin
 */
public class LinkStringMatcherTest {

  private StringMatcher stringMatcher = new LinkStringMatcher();

  @Test
  public void matchSameString() {
    int positive = 0;
    int negative = 0;
    for (int i = 0; i < 1_000_000; i++) {
      String str1 = "test";
      String str2 = "test";
      if (str1 == str2) {
        positive++;
      } else {
        negative++;
      }
    }
    System.out.println(String.format(" matchSameString positive = %d, negative = %d", positive, negative));
  }


  @Test
  public void matchSameLinks() {
    int positive = 0;
    int negative = 0;
    for (int i = 0; i < 1_000_000; i++) {
      String str1 = "test";
      String str2 = str1;
      if (str1 == str2) {
        positive++;
      } else {
        negative++;
      }
    }
    System.out.println(String.format(" matchSameLinks positive = %d, negative = %d", positive, negative));
  }

  @Test
  public void matchSameNewStrings() {
    int positive = 0;
    int negative = 0;
    for (int i = 0; i < 1_000_000; i++) {
      String str1 = "test";
      String str2 = new String("test");
      if (str1 == str2) {
        positive++;
      } else {
        negative++;
      }
    }
    System.out.println(String.format(" matchSameNewStrings positive = %d, negative = %d", positive, negative));

  }

  @Test
  public void matchSameValueOfStrings() {
    int positive = 0;
    int negative = 0;
    for (int i = 0; i < 1_000_000; i++) {
      String str1 = "val";
      String str2 = String.valueOf("val");
      if (str1 == str2) {
        positive++;
      } else {
        negative++;
      }
    }
    System.out.println(String.format(" matchSameNewStrings positive = %d, negative = %d", positive, negative));

  }

}
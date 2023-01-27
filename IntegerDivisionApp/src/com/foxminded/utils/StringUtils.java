package com.foxminded.utils;

import java.util.Arrays;

public class StringUtils {

   public static String spacer(int length) {
      return stringOfChar(length, ' ');

   }

   public static String dashLine(int length) {
      return stringOfChar(length, '-');
   }

   public static String stringOfChar(int length, char filler) {
      char[] chars = new char[length];
      Arrays.fill(chars, filler);
      return new String(chars);
   }
}
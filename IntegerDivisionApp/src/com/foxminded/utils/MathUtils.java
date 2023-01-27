package com.foxminded.utils;

public class MathUtils {
   public static int intLength(int number) {
      int length = number < 10 ? 1 : (int) Math.log10(number) + 1;
      return length;
   }
}
